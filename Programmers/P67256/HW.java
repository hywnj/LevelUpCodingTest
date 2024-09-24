package Programmers.P67256;

public class HW {
  static StringBuilder sb;

  public String solution(int[] numbers, String hand) {
    // 키패드 정보, 왼손 엄지손가락, 오른손 엄지손가락 세팅
    Point[] keypad = new Point[10];
    keypad[0] = new Point(3, 1, ' ');
    int idx = 1;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        keypad[idx++] = new Point(i, j, ' ');
      }
    }

    Point left = new Point(3, 0, 'L'); // 왼손 초기 위치
    Point right = new Point(3, 2, 'R'); // 오른손 초기 위치
    boolean leftHandFlag = (hand.equals("left")) ? true : false; // 왼손잡이 여부

    sb = new StringBuilder();
    for (int num : numbers) {
      boolean useLeftFlag = false; // 왼손을 쓰는 경우

      if (num % 3 == 2 || num == 0) { // 2 5 8 0
        int leftDiff = getDistance(keypad[num], left);
        int rightDiff = getDistance(keypad[num], right);

        useLeftFlag = (leftDiff == rightDiff) ? ((leftHandFlag) ? true : false) : (leftDiff < rightDiff) ? true : false;
      }

      if (useLeftFlag || num % 3 == 1) { // 1 4 7
        left.setPoint(keypad[num].x, keypad[num].y, 'L'); // 왼손 엄지 사용
      } else if (!useLeftFlag || num % 3 == 0) { // 3 6 9
        right.setPoint(keypad[num].x, keypad[num].y, 'R'); // 오른손 엄지 사용
      }
    }
    return sb.toString();
  }

  public int getDistance(Point target, Point hand) {
    // 좌표별 차이 절대값으로 구해서 더한 값이 현재 눌러야 할 숫자 키패드와 왼/오른손 키패드 거리
    return Math.abs(target.x - hand.x) + Math.abs(target.y - hand.y);
  }

  public class Point {
    char hand;
    int x;
    int y;

    public Point(int x, int y, char hand) {
      this.hand = hand;
      this.x = x;
      this.y = y;
    }

    public void setPoint(int x, int y, char hand) {
      this.hand = hand;
      sb.append(hand); // 사용한 손

      this.x = x;
      this.y = y;
    }
  }
}
