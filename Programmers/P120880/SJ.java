import java.util.*;

class SJ {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        double[] order = new double[numlist.length];
        
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] - n < 0) 
                // n을 뺏을 때 음수 값인 경우, +0.5를 해서 같은 거리에 있는 양수 값보다 정렬을 했을 시 뒤로 밀리도록 함 
                order[i] = ((int)Math.abs(numlist[i] - n)) + 0.5;
            else 
                order[i] = numlist[i] - n; 
        }
        
        Arrays.sort(order); // 오름차순 정렬
        
        for(int i = 0; i < numlist.length; i++) {
            if(order[i] % 1 != 0) answer[i] = n - (int)order[i];
            else answer[i] = (int)order[i] + n;
        }
        
        return answer;
    }
}