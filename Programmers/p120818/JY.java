package Programmers.p120818;

public class JY {

    class Solution {
        public int solution(int price) {
            int answer = 0;

            if (price >= 500000) {
                answer = (int) (price * 0.8);
            } else if (price >= 300000) {
                answer = (int) (price * 0.9);
            } else if (price >= 100000) {
                answer = (int) (price * 0.95);
            } else {
                answer = price;
            }

            return answer;
        }
    }

}
// 'incompatible types: possible lossy conversion from double to int' 라는 오류 발생
// int는 정수를 저장할 때 사용되기 때문에 소수점이 있는 값(실수형)을 int로 변환하면 소수점 아래의 수를 잃게 된다.
// 따라서 double을 int로 저장하는 것은 lossy 할 수 있기 때문에 자바는 허용하지 않는다.
// (int) 라는 강제 형변환 필요!
