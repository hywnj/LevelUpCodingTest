import java.util.HashMap;
import java.util.Map;

public class JK {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;

        //A의 선물지수 = 준 선물 - 받은 선물
        //A와 B가 선물을 주고받은 적이 없거나 같다면 A => B 선물
        //A와 B의 선물지수가 같다면 선물을 주고받지 않음

        //다음달에 가장 많은 선물을 받은 사람의 선물 수
        //선물지수가 가장 높은사람 -> 목표값


        //선물지수계산시 주어진 순서를 파악하기 위해 Map사용
        Map<String, Integer> friendMap = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            friendMap.put(friends[i], i);
        }


        //선물지수 배열
        int[] giftIndex = new int[friends.length];


        //선물관계입력
        int[][] table = new int[friends.length][friends.length];
        String[] giftTmp = new String[2];
        for (int i = 0; i < gifts.length; i++) {
            giftTmp = gifts[i].split(" ");

            // 선물지수 증가(선물한 친구)
            giftIndex[friendMap.get(giftTmp[0])]++;
            // 선물지수 감소(선물받은 친구)
            giftIndex[friendMap.get(giftTmp[1])]--;

            //선물
            table[friendMap.get(giftTmp[0])][friendMap.get(giftTmp[1])]++;
        }

        //선물지수 계산
        //1. 누가 선물을 많이 줬는지 -> 먼저 선물수 계산
        //2. 선물량이 같은경우 선물지수를 계산해 다음달 선물에 추가
        //3. 1, 2조건이 모두 같다면 선물을 주고받지않음
        for (int i = 0; i < friends.length; i++) {
            int giftCount = 0;
            for (int j = 0; j < friends.length; j++) {
                if (i == j) {
                    continue;
                }

                //선물을 주고받은 수를 비교해서 내가 준 선물이 많으면 받을선물 추가
                if (table[i][j] > table[j][i]) {
                    giftCount++;
                    //주고받은 선물수가 같고 내 선물지수가 높으면 받을선물 추가
                } else if (table[i][j]  == table[j][i] && giftIndex[i] > giftIndex[j]) {

                    giftCount++;
                }
            }

            //결과값을 선물지수 중 큰 값으로 교체
            answer = Math.max(answer, giftCount);
        }


        return answer;
    }
}
