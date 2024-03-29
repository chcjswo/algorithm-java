package programmers.level1;

/**
 * 약수의 합
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-12
 **/
public class Solution_3 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        answer += n;
        return answer;
    }
}
