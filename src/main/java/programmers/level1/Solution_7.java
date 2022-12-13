package programmers.level1;

/**
 * 콜라츠 추측
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-13
 **/
public class Solution_7 {
    public int solution(int num) {
        if (num == 1) {
            return 0;
        }
        long result = num;
        int answer = 0;
        while (true) {
            if (result % 2 == 0) {
                result /= 2;
            } else {
                result = (result * 3) + 1;
            }
            answer++;
            if (result == 1 || answer > 500) {
                break;
            }
        }
        return answer > 500 ? -1 : answer;
    }
}
