package udemy.q4;

/**
 * udemy 4-1 문제
 * Created by chcjswo on 2019-06-17
 * Blog: http://mocadev.tistory.com
 * Github: http://github.com/chcjswo
 */
public class Q4_1 {
    public static void main(String[] args) {
        Q4_1 q_1 = new Q4_1();
        String data = "3423234";
        System.out.println(q_1.string2int(data));
    }

    public int string2int(String data) {
        int num = 0;

        for (char c : data.toCharArray()) {
            num *= 10;
            num += c - '0';
        }

        return num;
    }
}
