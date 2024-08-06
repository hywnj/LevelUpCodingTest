package Programmers.P12910;

import java.util.Arrays;

public class Sujin {
	public int[] main(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0). toArray();
        
        if(answer.length == 0) answer = new int[] {-1};
        Arrays.sort(answer);
        return answer;
    }
}