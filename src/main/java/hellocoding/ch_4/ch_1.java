package hellocoding.ch_4;

import java.util.Arrays;
import java.util.List;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog http://mocadev.tistory.com
 * @github http://github.com/chcjswo
 * @since 2021-01-24
 **/
public class ch_1 {

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = sum(array);
        System.out.println("sum = " + sum);
    }

    public static int sum(List<Integer> array) {
        if (array.size() == 0)
            return 0;
        return array.get(array.size() - 1) + sum(array.subList(0, array.size() - 1));
    }

}
