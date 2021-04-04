package baekjoon;

import java.util.Arrays;
import java.util.HashMap;
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

        HashMap<String, Integer> al = new HashMap<>();
        al.put("A", 3);
        al.put("B", 2);
        al.put("C", 1);
        al.put("D", 2);
        al.put("E", 4);
        al.put("F", 3);
        al.put("G", 1);
        al.put("H", 3);
        al.put("I", 1);
        al.put("J", 1);
        al.put("K", 3);
        al.put("L", 1);
        al.put("M", 3);
        al.put("N", 2);
        al.put("O", 1);
        al.put("P", 2);
        al.put("Q", 2);
        al.put("R", 2);
        al.put("S", 1);
        al.put("T", 2);
        al.put("U", 1);
        al.put("V", 1);
        al.put("W", 1);
        al.put("X", 2);
        al.put("Y", 2);
        al.put("Z", 1);

    }

}
