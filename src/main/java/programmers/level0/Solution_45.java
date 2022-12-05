package programmers.level0;

/**
 * 치킨 쿠폰
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-05
 **/
public class Solution_45 {
    public int solution(int chicken) {
        int answer = 0;
        int carry = 0;
        int coupon = 10;

        while (chicken > 1) {
            carry += (chicken % coupon);
            answer += chicken / coupon;
            chicken += (chicken % coupon);
            chicken /= coupon;
        }

        answer += (carry / coupon);
        return answer;
    }
}
