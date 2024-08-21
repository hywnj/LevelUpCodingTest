package Programmers.P181855;

public class Hyewon {
  public int solution(String[] strArr) {
    int[] size = new int[31]; // 원소의 길이는 최대 30
    int max = 0;
    for (String str : strArr) {
      size[str.length()] += 1;
      if (size[str.length()] > max)
        max = size[str.length()];
    }
    return max;
  }
}
