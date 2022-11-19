package programmers.level0;

/**
 * 프로그래머스 - 레벨0 - 옹알이(1)
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-11-15
 **/
public class Solution_1 {
    public static void main(String[] args) {
        Solution_1 level01 = new Solution_1();
//        String[] s = {"aya", "yee", "u", "maa", "wyeoo"};
        String[] s = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        int solution = level01.solution(s);
        System.out.println("solution = " + solution);
    }

    public int solution(String[] babbling) {
        int answer = 0;
        for (String s : babbling) {
            if (s.matches("(aya|ye|woo|ma)+")) {
                answer++;
            }
        }
        return answer;
    }
}
