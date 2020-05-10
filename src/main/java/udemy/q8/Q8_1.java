package udemy.q8;

/**
 * Created by chcjswo on 2020-05-06
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
public class Q8_1 {
    private final int[] data = new int[100];
    private int topIndex = -1;

    public static void main(String[] args) {

    }

    public void push(int i) {
        data[++topIndex] = i;
    }

    public int pop() {
        if (topIndex < 0) {
            throw new RuntimeException("runtime exception");
        }

        return data[topIndex--];
    }
}
