package Programmers.P42885;

import java.util.Arrays;
import java.util.Scanner;

public class JY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("조난 당한 인원 수 : ");
        int n = sc.nextInt();

        System.out.print("조난 당한 사람들의 몸무게 : ");
        int[] people = new int[n];
        for (int i = 0; i < n; i++) {
            people[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(people));

        System.out.print("제한 무게 :");
        int limit = sc.nextInt();

        int result = solution(people, limit);

        System.out.println("필요한 구명보트 수 : " + result);

    }

    public static int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int min = 0;

        for (int max = people.length - 1; min <= max; max--) {
            // 반복문을 끝에서부터 시작해, max를 감소시킨다.
            if (people[min] + people[max] <= limit)
                // if문이 충족한다면, min+1과 max-1 아니라면 min과 max-1 값을 비교
                min++;
            answer++;
        }

        return answer;
    }

}
