package Programmers.P12903;

public class Hyewon {
    public String solution(String s) {
        int len = s.length();
        int middle = len / 2;

        if (len % 2 == 0) return s.substring(middle-1, middle+1);
        else return "" + s.charAt(middle);
    }
}
