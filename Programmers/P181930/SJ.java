package Programmers.P181930;

public class SJ {
	public int main (int a, int b, int c) {
        int answer = 0;
        
        if (a==b&&b==c) {
            answer = (a+b+c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        } else if (a==b&&b!=c||a==c&&c!=b||b==c&&c!=a) {
            answer = (a + b+ c) * (a*a + b*b +c*c);
        } else {
            answer = a+b+c;
        }
        return answer;
    }
}
