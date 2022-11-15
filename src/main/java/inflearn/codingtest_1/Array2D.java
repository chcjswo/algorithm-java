package inflearn.codingtest_1;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-10-03
 **/
public class Array2D {
    public static void main(String[] args) {
        int[][] grid = new int[3][4];
        solve(grid);
        grid[0][1] = 10;
        solve(grid);

        int[][] grid2 = new int[3][];
        grid2[0] = new int[2];
        grid2[1] = new int[7];
        grid2[2] = new int[5];
        solve(grid2);
    }

    private static void solve(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print("[" + i + "][" + j + "]=" + grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=================================");
    }
}
