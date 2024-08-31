class Solution {
    public String solution(String n_str) {

        while (true) {
            if (n_str.charAt(0) == '0') { // 문자열 첫번째가 0인지 확인하고
                n_str = n_str.substring(1); // 0이면 첫번째 문자 제거
            } else {
                return n_str;     // 반복해서 돌다가 0이 아닌걸 만나면 반환
    }
}


// parseInt로 문자열 -> 정수로 바꾸는 방식도 있다.

//class Solution {
//    public String solution(String n_str) {
//        String answer = "";
//
//        answer = Integer.parseInt(n_str) + "";
//
//        return answer;
//    }
//}