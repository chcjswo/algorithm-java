package programmers.level1;

/**
 * 이상한 문자 만들기
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-16
 **/
public class Solution_13 {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        int index = 0;
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            if (c != ' ') {
                result.append(index % 2 == 0 ? String.valueOf(c).toUpperCase() : String.valueOf(c).toLowerCase());
                index++;
            } else {
                result.append(" ");
                index = 0;
            }
        }
        return result.toString();
    }
}
