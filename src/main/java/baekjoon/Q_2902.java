package baekjoon;

import java.util.Scanner;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog http://mocadev.tistory.com
 * @github http://github.com/chcjswo
 * @since 2021-04-04
 **/
public class Q_2902 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();

        String[] split = str.split("-");
        StringBuffer sb = new StringBuffer();
        for (String s : split) {
            for (int i = 0; i < s.length(); i++) {
                sb.append(s.charAt(i));
                break;
            }
        }

        System.out.print(sb.toString());
    }

}
