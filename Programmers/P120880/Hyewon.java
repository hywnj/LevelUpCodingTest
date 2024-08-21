package Programmers.P120880;

import java.util.Arrays;

public class Hyewon {
    public int[] solution(int[] numlist, int n) {
        Integer[] boxed = Arrays.stream(numlist).boxed().toArray(Integer[]::new);

        Arrays.sort(boxed, (o1, o2) -> {
            int diff1 = Math.abs(n - o1);
            int diff2 = Math.abs(n - o2);

            if (diff1 != diff2) {
                return diff1 - diff2;
            } else {
                return o2 - o1; // 차이가 같을 경우 더 큰 수가 먼저 오도록
            }
        });

        int[] answer = Arrays.stream(boxed).mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
