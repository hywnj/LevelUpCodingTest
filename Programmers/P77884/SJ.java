

public class SJ {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {  // left ~ right 보다 작거나 같을때까지 반복
            int count = 0;
            
            for (int j = 1; j <= i; j++) {  // 1부터 i까지 돌면서 i를 j로 나눔
                if (i % j == 0) {  // i % j == 0이면 j가 i의 약수라는 뜻
                    count++;  // 따라서 count 증가
                    // 예를 들어 i가 12일 때 1,2,3,4,6,12 가 12의 약수이므로 count = 6
                }
            }
            // count가 짝수인지 홀수인지 확인
            if (count % 2 == 0) {  
                answer += i;  // 짝수면 더하기
                // 예를 들어, i = 12의 약수 개수는 6개니까 짝수, 따라서 12를 answer에 더함
            } else {
                answer -= i;  // 홀수면 빼기
            }
            // 예를 들어, i = 16의 약수 개수는 5개니까 홀수, 따라서 16을 answer에 뺌
        }
        return answer;
    }
}