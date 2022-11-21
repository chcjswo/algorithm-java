package programmers.level0;

/**
 * 코딩테스트 연습 > 코딩테스트 입문 > 외계행성의 나이
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-11-21
 **/
public class Solution_22 {
    public String solution(int age) {
        String s = String.valueOf(age);
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) + 49;
            answer.append((char) index);
        }
        return answer.toString();
//        String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49 + operand))).collect(Collectors.joining());
    }
}
