package Programmers.P150370;
import java.util.*;

public class Hyewon {
  public int[] solution(String today, String[] terms, String[] privacies) {
    String[] todayInfo = today.split("\\.");
    int todayY = Integer.parseInt(todayInfo[0]);
    int todayM = Integer.parseInt(todayInfo[1]);
    int todayD = Integer.parseInt(todayInfo[2]);

    Map<String, Integer> termsMap = new HashMap<>();
    for (String el : terms) {
      String[] temp = el.split(" ");
      termsMap.put(temp[0], Integer.parseInt(temp[1]));
    }

    List<Integer> list = new ArrayList<>();
    int collectionY, collectionM, collectionD;
    for (int i = 0; i < privacies.length; i++) {
      String[] privacyInfo = privacies[i].split(" ");
      String[] collectionDate = privacyInfo[0].split("\\.");
      collectionY = Integer.parseInt(collectionDate[0]);
      collectionM = Integer.parseInt(collectionDate[1]);
      collectionD = Integer.parseInt(collectionDate[2]);

      String typeOfTerms = privacyInfo[1];

      collectionM += termsMap.get(typeOfTerms);
      while (collectionM > 12) {
        collectionM -= 12;
        collectionY += 1;
      }

      if (collectionY > todayY) {
        continue;
      } else if (collectionY == todayY) {
        if (collectionM > todayM) {
          continue;
        } else if (collectionM == todayM) {
          if (collectionD > todayD)
            continue;
        }
      }
      list.add(i + 1);
    }

    int[] answer = new int[list.size()];
    int idx = 0;
    for (int index : list) {
      answer[idx++] = index;
    }
    return answer;
  }
}