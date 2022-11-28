package programmers.level0;

/**
 * OX퀴즈
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-11-28
 **/
public class Solution_36 {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] s = quiz[i].split(" ");
            int num1 = Integer.parseInt(s[0]);
            int num2 = Integer.parseInt(s[2]);
            int num3 = Integer.parseInt(s[4]);
            if ("+".equals(s[1])) {
                answer[i] = num1 + num2 == num3 ? "O" : "X";
            } else {
                answer[i] = num1 - num2 == num3 ? "O" : "X";
            }
        }
        return answer;
    }
}
