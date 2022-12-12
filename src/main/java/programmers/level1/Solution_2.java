package programmers.level1;

/**
 * 자릿수 더하기
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-12
 **/
public class Solution_2 {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}
