package programmers.level0;

/**
 * 코딩테스트 연습 > 코딩테스트 입문 > 가위 바위 보
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-11-22
 **/
public class Solution_28 {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rsp.length(); i++) {
            int item = rsp.charAt(i) - '0';
            switch (item) {
                case 2:
                    sb.append("0");
                    break;
                case 0:
                    sb.append("5");
                    break;
                case 5:
                    sb.append("2");
                    break;
                default:
            }
        }
        return sb.toString();
    }
}
