class SJ {
    public int solution(int price) {
        int answer = 0;
        
        // 첫번째부터 순서대로 실행되기에 큰 수부터 작성해서 걸러지도록 함
        if ( price >= 500000) {
            answer = (int) (price*0.8);
        } else if (price >= 300000) {
            answer = (int) (price*0.9);
        } else if (price >= 100000) {
            answer = (int) (price*0.95);
        } else {
            answer = price;
        }
        return answer;
    }
}