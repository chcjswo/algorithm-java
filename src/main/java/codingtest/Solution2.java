package codingtest;

/**
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-11-14
 **/
public class Solution2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 3};
        int[] b = {1,3,2,3};

        Solution2 solution = new Solution2();
        int solution1 = solution.solution(a, b);
        System.out.println("solution1 = " + solution1);
    }

    public int solution(int[] A, int[] B) {
        int min = 99;
        int[] result = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i]) {
                if (A[i] > B[i]) {
                    result[i] = B[i];
                } else {
                    result[i] = A[i];
                }
            }
        }

        for (int j : result) {
            if (j > 0) {
                if (min > j) {
                    min = j;
                }
            }
        }

        return min == 99 ? A.length + 1 : min;
    }
}
