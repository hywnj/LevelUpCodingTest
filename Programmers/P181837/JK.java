package Programmers.P181837;

public class JK {
    public int solution(String[] order) {
        //latte의 경우만 확인
        int answer = 0;
        int americano = 4500;
        int latte = 5000;

        for (String s : order) {
            if(s.contains("latte")){
                answer += latte;
            }else{
                answer += americano;
            }
        }
        return answer;
    }
}
