package udemy.q8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chcjswo on 2020-05-17
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
public class Q8_2<T> {
    private List<T> list;

    public Q8_2() {
        list = new ArrayList();
    }

    public static void main(String[] args) {
        Q8_2 q8_2 = new Q8_2();
        q8_2.push("a");
        System.out.println(q8_2.pop());
    }

    public void push(T i) {
        list.add(i);
    }

    public T pop() {
        return list.remove(list.size() - 1);
    }
}
