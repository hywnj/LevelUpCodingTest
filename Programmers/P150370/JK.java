package Programmers.P150370;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JK {
    public int[] solution(String today, String[] terms, String[] privacies) {

        //날짜객체 안쓰고 풀어보기 -> 효율 좋은편 ..?
//        테스트 1 〉	통과 (0.14ms, 71.1MB)
//        테스트 2 〉	통과 (0.34ms, 73.4MB)
//        테스트 3 〉	통과 (0.26ms, 73.3MB)
//        테스트 4 〉	통과 (0.19ms, 72MB)
//        테스트 5 〉	통과 (0.24ms, 77.3MB)
//        테스트 6 〉	통과 (0.36ms, 84.3MB)
//        테스트 7 〉	통과 (0.46ms, 77.1MB)
//        테스트 8 〉	통과 (0.38ms, 76.2MB)
//        테스트 9 〉	통과 (1.10ms, 66.5MB)
//        테스트 10 〉 통과 (1.26ms, 74.7MB)
//        테스트 11 〉 통과 (0.88ms, 81.8MB)
//        테스트 12 〉 통과 (1.78ms, 75.2MB)
//        테스트 13 〉 통과 (1.32ms, 78.5MB)
//        테스트 14 〉 통과 (0.81ms, 74.9MB)
//        테스트 15 〉 통과 (1.23ms, 74.5MB)
//        테스트 16 〉 통과 (1.15ms, 66.1MB)
//        테스트 17 〉 통과 (1.41ms, 77.8MB)
//        테스트 18 〉 통과 (1.25ms, 73.6MB)
//        테스트 19 〉 통과 (2.50ms, 89.1MB)
//        테스트 20 〉 통과 (1.38ms, 74.2MB)

        List<Integer> answerTmp = new ArrayList<>();

        String[] todays;
        todays = today.split("\\.");

        //1 - term을 map으로 변경
        Map<String, String> termsMap = new HashMap<>();
        for (String term : terms) {
            String[] tmp;
            tmp = term.split(" ");
            termsMap.put(tmp[0], tmp[1]);
        }

        //2 - privacies 순회
        for (int i=0; i< privacies.length; i++) {
            String[] tmp;
            tmp = privacies[i].split(" "); // -> privacy set
            //3
            int expiresIn = Integer.parseInt(termsMap.get(tmp[1])); // -> 유효기간 추출
            String[] expireDate = monthCalculator(tmp[0], expiresIn); // -> 만료일 set

            int expireYear = Integer.parseInt(expireDate[0]);
            int todayYear = Integer.parseInt(todays[0]);

            int expireMonth = Integer.parseInt(expireDate[1]);
            int todayMonth = Integer.parseInt(todays[1]);

            int expireDay = Integer.parseInt(expireDate[2]);
            int todayDay = Integer.parseInt(todays[2]);

            //expire가 today보다 큰지 확인
            if(expireYear > todayYear){
                continue;
            }else if(expireYear == todayYear){ //년도가 같으면 월 비교
                if(expireMonth > todayMonth){
                    continue;
                }else if(expireMonth == todayMonth){ //월이 같으면 일 비교
                    if(expireDay > todayDay){
                        continue;
                    }
                }
            }
            //expire의 year, month, day가 모두 today보다 작으면 결과에 추가
            answerTmp.add(i+1);
        }

        int[] answer = new int[answerTmp.size()];
        for (int i = 0; i < answerTmp.size(); i++) {
            answer[i] = answerTmp.get(i);
        }
        return answer;
    }

    //만료일 계산 메서드
    public String[] monthCalculator(String privacyCreated, int expiresIn){
        String[] date = privacyCreated.split("\\.");

        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);

        month += expiresIn;

        int yearTmp = 0;


        if(month % 12 == 0){//만료일이 12월인경우 대응
            month -= 1;
            yearTmp = month/12;
            year += yearTmp;

            month %= 12;
            month += 1;
        }else{
            yearTmp = month/12;
            year += yearTmp;

            month %= 12;
            if(month == 0){
                month = 1;
            }
        }

        date[0] = String.valueOf(year);
        date[1] = String.valueOf(month);
        date[2] = String.valueOf(date[2]);
        return date; //계산된 만료일 리턴
    }
}
