package Programmers.P77884;

public class Hyewon {
  public int solution(int left, int right) {
    int answer = 0;
    for (int num = left; num <= right; num++) {
      int cnt = 0;
      for (int i = 1; i <= num; i++) {
        if (num % i == 0)
          cnt++; // 나눠진다면 약수의 개수 plus
      }
      if (cnt % 2 == 0)
        answer += num; // 약수의 개수가 짝수면 더하고
      else
        answer -= num; // 홀수면 뺌
    }
    return answer;
  }
}
