package Programmers.P12926;

public class HW {
    public String solution(String s, int n) {
        int capitalStart = 65;
        int capitalEnd = 90;
        int smallEnd = 122;

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append(' ');
                continue;
            }

            int c = s.charAt(i);
            int slide = c + n;
            if (c >= capitalStart && c <= capitalEnd) { // 대문자
                if (slide > capitalEnd)
                    slide -= 26;
            } else { // 소문자
                if (slide > smallEnd)
                    slide -= 26;
            }
            sb.append((char) slide);

        }
        return sb.toString();
    }
}
