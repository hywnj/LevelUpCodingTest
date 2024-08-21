package Programmers.P181832;

import java.util.Arrays;

public class Hyewon {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(4)));
        System.out.println(Arrays.deepToString(solution(5)));
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        // 좌 > 하 > 우 > 상
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int direction = 0;

        int num = 1; // 배열에 넣을 수
        int x = 0;
        int y = 0;
        for (int i = 0; i < n * n; i++) {
            if (answer[x][y] != 0) continue;
            // 아직 숫자를 채우지 않은 경우
            answer[x][y] = num++; // 숫자 넣기
            // 현재 방향으로 한칸 이동
            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                if (answer[nx][ny] == 0) { // 현 방향으로 한 칸 이동했고, 범위 초과하지 않았고, 숫자도 할당하지 않은 인덱스
                    x = nx;
                    y = ny;
                    continue;
                }
            }

            // 현재 방향쪽으로 더이상 이동할 수 없을때, 다음 방향으로 전환
            //  - 범위를 초과할때
            //  - 이동한 위치에 이미 숫자가 할당되어 있을때
            direction = (direction + 1) % 4;
            // 전환한 방향으로 한칸 이동
            x += dx[direction];
            y += dy[direction];


        }
        return answer;
    }

}
