package programmers.level0;

/**
 * 외계어 사전
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-09
 **/
public class Solution_51 {
    public int solution(String[] spell, String[] dic) {
        boolean check;
        for (String s : dic) {
            check = false;
            for (String value : spell) {
                if (s.contains(value)) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
            if (check) {
                return 1;
            }
        }
        return 2;
    }
}
