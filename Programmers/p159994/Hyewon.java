package Programmers.p159994;

public class Hyewon {
  public String solution(String[] cards1, String[] cards2, String[] goal) {
    String answer = "No";
    int cards1Idx = 0;
    int cards2Idx = 0;
    boolean flag = true;
    for (String target : goal) {
      if (cards1Idx < cards1.length && target.equals(cards1[cards1Idx])) {
        cards1Idx++;
        continue;
      }
      if (cards2Idx < cards2.length && target.equals(cards2[cards2Idx])) {
        cards2Idx++;
        continue;
      }
      flag = false;
      break;
    }
    if (flag)
      answer = "Yes";
    return answer;
  }
}
