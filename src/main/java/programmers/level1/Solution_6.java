package programmers.level1;

/**
 * 두 정수 사이의 합
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-13
 **/
public class Solution_6 {
    public long solution(int a, int b) {
        long answer = 0;
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        for (int i = min; i <= max; i++) {
           answer += i;
        }
        return answer;
    }
}
