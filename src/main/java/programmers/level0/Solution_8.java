package programmers.level0;

/**
 * 피자 나눠 먹기 (2)
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-11-18
 **/
public class Solution_8 {

    public static void main(String[] args) {
        int solution = solution(4);
        System.out.println("solution = " + solution);
    }

    private static int solution(int n) {
        int pizzaSliceCount = 6;
        // 최대 공약수 구하기
        int answer = gcd(n, pizzaSliceCount);
        // 최소 공배수 반환
        return (n * pizzaSliceCount / answer) / pizzaSliceCount;
    }

    private static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
