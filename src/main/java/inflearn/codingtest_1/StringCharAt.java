package inflearn.codingtest_1;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-27
 **/
public class StringCharAt {
    public static void main(String[] args) {
        String nums1 = "123";
        String nums2 = "888";

        final String solve = new StringCharAt().solve(nums1, nums2);
        System.out.println("solve = " + solve);
    }

    public String solve(String num1, String num2) {
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int num1Length = num1.length() - 1;
        int num2Length = num2.length() - 1;

        while (num1Length >= 0 || num2Length >= 0) {
            int n1 = 0;
            int n2 = 0;

            if (num1Length >= 0) {
                n1 = num1.charAt(num1Length) - '0';
            }
            if (num2Length >= 0) {
                n2 = num2.charAt(num2Length) - '0';
            }
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            sb.append(sum % 10);
            num1Length--;
            num2Length--;
        }
        if (carry != 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
}
