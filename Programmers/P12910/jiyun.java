package Programmers.P12910;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class jiyun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int divisor = sc.nextInt();
        int[] result = solution(arr,divisor);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for(int i=0; i<arr.length; i++) { // 향상된 for문 사용
            if(arr[i]%divisor==0) {
                resultList.add(arr[i]);
            }
        }
        if(resultList.isEmpty()) {
            resultList.add(-1);
        }

        int[] sol_result = resultList.stream().mapToInt(i->i).toArray();
        Arrays.sort(sol_result);
        return sol_result;
    }


}

// array, list 비교 + arraylist에 대해서

// stream 방식 (https://velog.io/@yun8565/Java-%EC%8A%A4%ED%8A%B8%EB%A6%BCStream-%EC%A0%95%EB%A6%AC)
class Solution02 {
    public int[] solution02(int[] arr, int divisor) {
        int[] result = Arrays.stream(arr)
                .filter(n -> n % divisor == 0) // 나눠 떨어지는 것만 필터링
                .sorted() //오름차순 정렬
                .toArray(); //배열로 변환

        if (result.length == 0) {
            result = new int[]{-1};
        }

        return result;
    }
}
