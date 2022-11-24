package resolution.permutation;

import java.util.Arrays;

/**
 * 순열 - combination
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-11-24
 **/
public class Combination_1 {

    private static int n, m;
    private static int[] arr; // 원소를 저장할 배열
    private static boolean[] visited; // 중복을 제거하기 위한 방문 처리
    private static int count = 0;

    public static void main(String[] args) {
        n = 5;
        m = 3;
        arr = new int[m];
        visited = new boolean[n + 1];
        combination(0, 1);
        System.out.println("count = " + count);
    }

    private static void combination (int cnt, int start) {
        if (cnt == m) {
            System.out.println(Arrays.toString(arr));
            count++;
            return;
        }
        for (int i = start; i <= n; i++) {
            arr[cnt] = i;
            combination(cnt + 1, i + 1); // 오름차순으로 구하면 중복 체크하지 않아도 됨
        }
    }

}
