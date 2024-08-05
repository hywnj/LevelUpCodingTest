package Programmers.P181930;

public class Hyewon {
    public int solution(int a, int b, int c) {
        int answer = a + b + c;
        // Math.pow(double a, double b) : a의 b제곱
        // Math.pow()는 다양한 지수 계산에 유연하게 사용할 수 있습니다.
        // 하지만 단순한 제곱이나 세제곱 계산에서는 비효율적일 수 있습니다.
        if (a == b || b == c || a == c) answer *= (a*a)+(b*b)+(c*c);
        if (a == b && b == c) answer *= (a*a*a)+(b*b*b)+(c*c*c);

        return answer;
    }
}
