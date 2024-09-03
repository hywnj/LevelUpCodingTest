class Solution {
    public int[] solution(int money) {
        int buy =0 ;
        int change =0;
        buy = money/5500;
        change = money%5500;
        int[] answer = {buy,change};
        return answer;
    }
}