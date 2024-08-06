package Programmers.P12903;

public class JK {
    public static void main(String[] args) {
        JK cs = new JK();

        String r = cs.solution("abcdefg");
        System.out.println(r);
    }


    public String solution(String s) {
        int length = s.length();
        int center = length/2;

        if(length % 2 == 0){
            return s.substring(center -1, center + 1);
        }
        return String.valueOf(s.charAt(center));
    }
}
