package programmers.level0;

/**
 * 개미 군단
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-23
 **/
public class Solution_29 {
    public int solution(int hp) {
        int[] ants = {5, 3, 1};
        int answer = 0;
        for (int ant : ants) {
            int i = hp/ant;
            answer += i;
            hp %= ant;
        }
        return answer;
    }
}
