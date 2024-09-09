package Programmers.P42862;

import java.util.Arrays;
import java.util.Scanner;

public class JY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("전체 학생 수 : ");
        int n = sc.nextInt();

        System.out.print("체육복을 도둑 맞은 학생의 수 : ");
        int lost_size = sc.nextInt();

        System.out.print("체육복을 도둑 맞은 학생들의 번호 : ");
        int[] lost = new int[lost_size];
        for (int i = 0; i < lost_size; i++) {
            lost[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(lost));

        System.out.print("여분의 체육복이 있는 학생의 수 : ");
        int res_size = sc.nextInt();

        System.out.print("여분의 체육복이 있는 학생들의 번호 : ");
        int[] reserve = new int[res_size];
        for (int i = 0; i < res_size; i++) {
            reserve[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(reserve));

        int result = solution(n, lost, reserve);

        System.out.println("체육 수업에 참여할 수 있는 학생 수: " + result);

    }

    private static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length; // 전체 학생수 - 도난 당한 학생 수 = 체육을 참여할 수 있는 학생수

        // 정렬하는 이유 : 중복방지 ( lost =[4,2] reserve=[3,5]인 경우, 3번이 4번을 빌려주게 되어 2번이 체육복을 빌리지
        // 못하게 된다. )

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 내가 체육복을 도난 맞았지만, 여분 옷이 있는 경우
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer += 1;

                    // 내가 나에게 빌려줬으니, 해당 값을 무효화
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        // 내가 체육복을 도난 맞지 않고 여분옷이 있을 때, 도난 맞은 학생에게 여분옷을 빌려주는 경우
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if ((lost[i] - 1 == reserve[j]) || (lost[i] + 1 == reserve[j])) {
                    answer += 1;

                    // 여분 옷을 빌려줬으니, 해당 값 무효화
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }

}
