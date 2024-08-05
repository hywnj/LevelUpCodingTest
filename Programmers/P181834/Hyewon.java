package Programmers.P181834;

public class Hyewon {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for (int c = 0; c < myString.length(); c++) {
            if (myString.charAt(c) < 'l') sb.append("l");
            else sb.append(myString.charAt(c));
        }
        return sb.toString();
    }
}
