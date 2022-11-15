package inflearn.codingtest_1;


import java.util.LinkedList;
import java.util.Queue;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-10-18
 **/
public class BFS_01 {

    private static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private static int m, n;

    public static void main(String[] args) {
        char[][] grid = {{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '1', '1'},};

        final int solve = solve(grid);
        System.out.println("solve = " + solve);
    }

    private static int solve(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    bfs(grid, i, j);
                }
            }
        }


        return count;
    }

    private static void bfs(char[][] grid, int i, int j) {
        grid[i][j] = 'X';
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            for (int[] dir : dirs) {
                int x1 = cur[0] + dir[0];
                int y1 = cur[1] + dir[1];

                if (x1 >= 0 && y1 >= 0 && x1 < m && y1 < n && grid[x1][y1] == '1') {
                    System.out.println("x1: " + x1 + " y1: " + y1);
                    grid[x1][y1] = 'X';
                    queue.offer(new int[]{x1, y1});
                }
            }
        }
    }
}
