class Solution {
    public int solution(String[][] board, int h, int w) {
        int count = 0;
        int n = board.length;
        String target = board[h][w];

        // 상하좌우 방향 탐색을 위한 배열 (상, 하, 좌, 우)
        int[] dh = {-1, 1, 0, 0}; // 세로범위로 이동하는 포인터임. 위로 이동 -> -1
        int[] dw = {0, 0, -1, 1}; // 가로범위로 이동하는 포인터임. 좌로이동 -> -1

        // 상하좌우를 순회하며 조건에 맞는지 확인
        for (int i = 0; i < 4; i++) {
            int nh = h + dh[i];  // 새로운 높이 인덱스 -> 현재 루프에서 방문할 좌표(주어진 좌표 + 포인터좌표)
            int nw = w + dw[i];  // 새로운 너비 인덱스 -> 현재 루프에서 방문할 좌표(주어진 좌표 + 포인터좌표)

            // 배열의 경계를 벗어나지 않도록 체크
            // 각 경계선을 넘어가지 않는 경우에만 값 확인
            if (nh >= 0 && nh < n && nw >= 0 && nw < n) {
                // 인접한 셀이 현재 셀의 값과 같으면 카운트 증가
                if (board[nh][nw].equals(target)) {
                    count++;
                }
            }
        }
        return count;
    }
}


