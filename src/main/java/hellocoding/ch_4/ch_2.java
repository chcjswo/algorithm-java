package hellocoding.ch_4;

import java.util.Arrays;
import java.util.List;

/**
 * @author chcjswo
 * @version 1.0.0
 * @Blog http://mocadev.tistory.com
 * @Github http://github.com/chcjswo
 * @since 2021-01-24
 **/
public class ch_2 {

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 2, 3, 4, 5, 6);

        int count = count(array);
        System.out.println("count = " + count);
    }

    public static int count(List<Integer> arrays) {
        if (arrays.size() == 0)
            return 0;
        return 1 + count(arrays.subList(0, arrays.size() - 1));
    }

}
