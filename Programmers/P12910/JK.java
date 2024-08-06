package Programmers.P12910;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JK {
    public static void main(String[] args) {
        JK ary = new JK();

    }


    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            if(i % divisor == 0){
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];

        if(list.size() == 0 ){
            return new int[]{-1};
        }else {
            Collections.sort(list);

            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }

        return answer;

    }


}
