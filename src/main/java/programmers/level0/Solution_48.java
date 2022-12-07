package programmers.level0;

/**
 * 직사각형 넓이 구하기
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-07
 **/
public class Solution_48 {
    public int solution(int[][] dots) {
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int i = 0; i < dots.length; i++) {
            if (dots[i][0] < minX) {
                minX = dots[i][0];
            }
            if (dots[i][0] > maxX) {
                maxX = dots[i][0];
            }
            if (dots[i][1] < minY) {
                minY = dots[i][1];
            }
            if (dots[i][1] > maxY) {
                maxY = dots[i][1];
            }
        }
        return (maxX - minX) * (maxY - minY);
    }
}
