package Programmers.P12935;

public class Hyewon {
  public int[] solution(int[] arr) {
    int len = arr.length;
    if (len == 1)
      return new int[] { -1 };

    int min = Integer.MAX_VALUE;
    int minIdx = 0;
    for (int i = 0; i < len; i++) {
      if (arr[i] < min) {
        min = arr[i];
        minIdx = i;
      }
    }

    int[] answer = new int[len - 1];
    int idx = 0;
    for (int i = 0; i < len; i++) {
      if (i != minIdx)
        answer[idx++] = arr[i];
    }
    return answer;
  }
}
