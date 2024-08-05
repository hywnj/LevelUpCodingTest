package Programmers.P12910;

import java.util.*;

public class Hyewon {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int num: arr) {
            if (num % divisor == 0) list.add(num);
        }

        if (list.size() == 0) return new int[] {-1};

        Collections.sort(list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
