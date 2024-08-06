package Baekjoon.B2798;

import java.io.*;
import java.util.*;

public class Hyewon {
    static boolean[] checked;
    static List<Integer> numbers = new ArrayList<>();
    static int m;
    static int sum = 0;
    static int max = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<n; i++) {
            numbers.add(Integer.parseInt(st.nextToken()));
        }
        Collections.reverse(numbers);

        // N개 중 3개 조합 구하기
        // O(N^3) = 최악의 경우, 100^3 = 1,000,000 (백만)
        checked = new boolean[n];
        combination(n, 0, 0);

        System.out.println(max);
    }

    public static void combination(int n, int r, int start) {
        if (sum > max) max = sum; // 최댓값 갱신

        if (r == 3) { // 3개 선택 완료
            int calculate = 0;
            for (int i=0; i<n; i++) {
                if (checked[i]) {
                    calculate += numbers.get(i);
                }
            }
            if (calculate <= m) sum = calculate; // 합이 m이하인 경우만 sum에 할당
            return;
        }
        for (int i=start; i<n; i++) {
            checked[i] = true;
            combination(n, r+1, i+1);
            checked[i] = false;
        }
    }
}
