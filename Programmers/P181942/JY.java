package Programmers.P181942;

class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        for (int i = 0; i < str1.length(); i++) {
            answer = answer + str1.charAt(i) + str2.charAt(i);
        }
        return answer;
    }
}

// charAt() : 문자열에서 특정 위치에 있는 문자를 반환하는 메서드