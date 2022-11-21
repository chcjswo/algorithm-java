package programmers.level0;

/**
 * 문자 반복 출력하기
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-20
 **/
public class Solution_15 {
    public String solution(String string, int n) {
        StringBuilder answer = new StringBuilder();
        final String[] split = string.split("");
        for (String s : split) {
            answer.append(s.repeat(n));
        }
        return answer.toString();
    }
}
