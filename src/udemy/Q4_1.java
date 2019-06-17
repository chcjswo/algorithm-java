package udemy;

/**
 * udemy 4-1 문제
 * Created by chcjswo on 2019-06-17
 * Blog: http://mocadev.tistory.com
 * Github: http://github.com/chcjswo
 */
public class Q4_1 {
    public static void main(String[] args) {
        String data = "3423234";
        int num = 0;

        for (char c : data.toCharArray()) {
            num *= 10;
            num += c - '0';
        }

        System.out.println(num);
    }
}
