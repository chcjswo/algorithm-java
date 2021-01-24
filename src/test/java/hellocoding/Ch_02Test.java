package hellocoding;

import hellocoding.ch_1.Ch_02;
import org.junit.jupiter.api.Test;

/**
 * @author chcjswo
 * @version 1.0.0
 * @Blog http://mocadev.tistory.com
 * @Github http://github.com/chcjswo
 * @since 2021-01-17
 **/
class Ch_02Test {

    @Test
    void test() {
        int[] arr = {5, 3, 2, 8, 6};
        Ch_02 a = new Ch_02();

        a.selectionSort(arr);

    }

}
