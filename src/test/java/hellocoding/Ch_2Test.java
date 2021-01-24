package hellocoding;

import hellocoding.ch_1.Ch_2;
import org.junit.jupiter.api.Test;

/**
 * @author chcjswo
 * @version 1.0.0
 * @Blog http://mocadev.tistory.com
 * @Github http://github.com/chcjswo
 * @since 2021-01-17
 **/
class Ch_2Test {

    @Test
    void test() {
        int[] arr = {5, 3, 2, 8, 6};
        Ch_2 a = new Ch_2();

        a.selectionSort(arr);

    }

}
