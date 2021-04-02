package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog http://mocadev.tistory.com
 * @github http://github.com/chcjswo
 * @since 2021-04-02
 **/
public class Q_17269 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n1 = sc.nextInt();
    	int n2 = sc.nextInt();
    	String a = sc.next();
    	String b = sc.next();
    	String[] c = new String[n1 + n2];

    	int index = 0;
        for (int i = 0; i <= Math.min(n1, n2); i++) {
            if (a.length() == i || b.length() == i) {
                break;
            }
            c[i * 2] = String.valueOf(a.charAt(i));
            c[i * 2 + 1] = String.valueOf(b.charAt(i));
            index++;
        }

        System.out.println("i = " + index);

        if (n1 > index) {
            for (int i = index; i < n1; i++) {
                c[n2 + i] = String.valueOf(a.charAt(i));
            }
        }
        if (n2 > index) {
            for (int i = index; i < n2; i++) {
                c[n1 + i] = String.valueOf(b.charAt(i));
            }
        }

        Arrays.stream(c).forEach(System.out::println);
    }

}
