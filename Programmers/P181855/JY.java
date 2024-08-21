package Programmers.P181855;

import java.util.HashMap;
import java.util.Map;

public class JY {
     public int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();
        // 키는 문자열의 길이이고, 값은 그 길이를 가진 문자열의 개수

        
        for (int i=0; i<strArr.length; i++) {
            String str = strArr[i]; // i번째 문자열
            int length = str.length(); // i번째 문자열의 길이
            map.put(length, map.getOrDefault(length, 0) + 1);
            // .getOrDefault()는 Java의 Map 인터페이스에 포함된 메서드로, 특정 키에 대해 값을 가져올 때 사용하는 기능
            // length의 키 값에 해당하는 값을 가져온다.
            // length=1일때, 해당 값이 없으면 0을 반환+1 을 해서, map.put(1,1)를 수행하여 맵에 {1=1}을 저장
            // 다시 length=1 이면, {1=1}을 확인하여, 1을 반환 받고+1 하여, map.put(1,2)를 수행 {1=2}을 저장
        }
        
       int maxCount = 0;
        for (int count : map.values()) {
            // 향상된 for문을 사용하여, map의 값들을 반복하여, 첫번째 값부터 count에 넣고
            // Math.max를 사용하여 maxCount와 count 중 큰 값을 maxCount넣는 방식을 차례대로 반복한다.
            maxCount = Math.max(maxCount, count);
        } 
        
        return maxCount;
        // 가장 큰 값 리턴
    }
}
    

