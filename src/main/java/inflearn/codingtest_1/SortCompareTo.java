package inflearn.codingtest_1;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-10-12
 **/
public class SortCompareTo {

    public static void main(String[] args) {
        String v1 = "8.5.2.4";
        String v2 = "8.5.2";

        final int solve = solve(v1, v2);
        System.out.println("solve = " + solve);
    }

    private static int solve(String v1, String v2) {
        String[] v1Array = v1.split("\\.");
        String[] v2Array = v2.split("\\.");

        int length = Math.max(v1Array.length, v2Array.length);
        for (int i = 0; i < length; i++) {
            final Integer v1Int = i < v1Array.length ? Integer.parseInt(v1Array[i]) : 0;
            final Integer v2Int = i < v2Array.length ? Integer.parseInt(v2Array[i]) : 0;

            int comp = v1Int.compareTo(v2Int);
            if (comp != 0) {
                return comp;
            }
        }

        return 0;
    }
}
