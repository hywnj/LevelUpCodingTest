package Programmers.P12930;

public class HW {
    public String solution(String s) {
        String[] arr = s.split("");
        String answer = "";
        int idx = 0;

        for (String ss : arr) {
            idx = ss.contains(" ") ? 0 : idx + 1;
            answer += (idx % 2 == 0) ? ss.toLowerCase() : ss.toUpperCase();
        }

        // for (int i=0; i<arr.length; i++) {
        // if (idx % 2 == 0) {
        // answer += arr[i].toUpperCase();
        // } else {
        // answer += arr[i].toLowerCase();
        // }
        // idx++;
        // if (arr[i].equals(" ")) idx = 0;
        // }
        return answer;
    }
}
