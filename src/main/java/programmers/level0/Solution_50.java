package programmers.level0;

/**
 * 다항식 더하기
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-09
 **/
public class Solution_50 {
    public String solution(String polynomial) {
        int number = 0 ;
        int notNumber = 0;
        String[] split = polynomial.replace(" ", "").split("[+]");
        for (String s1 : split) {
            if (s1.contains("x")) {
                String x = s1.replace("x", "");
                notNumber += Integer.parseInt("".equals(x) ? "1" : x);
            } else {
                number += Integer.parseInt(s1);
            }
        }

        StringBuilder sb = new StringBuilder();
        if (notNumber > 0) {
            sb.append(notNumber == 1 ? "" : notNumber).append("x");
        }
        if (notNumber > 0 && number > 0) {
            sb.append(" + ");
        }
        if (number > 0) {
            sb.append(number);
        }
        return sb.toString();
    }
}
