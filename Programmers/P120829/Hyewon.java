package Programmers.P120829;

public class Hyewon {
  public int solution(int angle) {
    return (angle < 90) ? 1 : (angle == 90) ? 2 : (angle < 180) ? 3 : 4;
  }
}
