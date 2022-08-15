package resolution.recusive;

/**
 * 피보나치
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-15
 **/
public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        final int sum = fibonacci.sum(100);
        System.out.println("sum = " + sum);
        final int dynamicSum = fibonacci.dynamicSum(10);
        System.out.println("dynamicSum = " + dynamicSum);
    }

    private int sum(int value) {
        if (value <= 1) {
            return value;
        }

        return sum(value - 1) + sum(value - 2);
    }

    private int dynamicSum(int value) {
        int[] memoization = new int[value + 1];
        memoization[0] = 0;
        memoization[1] = 1;
        for (int i = 2; i < value + 1; i++) {
            memoization[i] = memoization[i - 1] + memoization[i -2];
        }
        return memoization[value];
    }
}
