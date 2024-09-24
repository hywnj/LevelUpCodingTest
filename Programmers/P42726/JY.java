package Programmers.P42726;

import java.util.*;

public class JY {

    public class Solution {
        public String solution(int[] numbers) {
            String answer = "";
            String[] numberStr = new String[numbers.length];

            for (int i = 0; i < numbers.length; i++)
                numberStr[i] = String.valueOf(numbers[i]);
            // 숫자 배열을 문자 배열로 변환 (숫자보다 문자 비교가 더 효율적)

            Arrays.sort(numberStr, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
            // 문자열 배열을 정렬
            // 두 문자열을 붙였을 때, 더 큰 수가 나오는 순서를 결정 (compareTo의 역할)

            for (String str : numberStr)
                answer += str;
            // 정렬된 문자열 배열을 순차적으로 이어 붙임

            if (answer.charAt(0) == '0') {
                answer = "0";
            }
            // 정렬 후, 첫번째 문자가 0인 경우와 모든 값으 0인경우
            // 결과 값을 0으로 변환

            return answer;
        }
    }

}
