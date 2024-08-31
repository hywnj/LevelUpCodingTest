import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score); // 오름 차순으로 정렬
        
        // score의 길이 - m 부터 시작해서, m 만큼 감소
        for(int i=score.length-m; i>=0; i -=m){
            answer += score[i]*m; //(각각의 최저점수 * m)들의 합
        }
        return answer;
        }
    }





       
      