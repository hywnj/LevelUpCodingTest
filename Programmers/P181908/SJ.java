class SJ {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        if(my_string.endsWith(is_suffix)) {
            // endsWith() => 자바에서 문자열이 특정한 접미사로 끝나는지를 확인하는 데 사용
            // 만약 문자열이 해당 접미사로 끝난다면 true반환 아니라면 false반환
            answer = 1;
        }
        return answer;
    }
}