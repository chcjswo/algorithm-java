package hellocoding;

import hellocoding.ch_1.Ch_01;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author chcjswo
 * @version 1.0.0
 * @since 2021-01-14
 **/
class Ch_01Test {

    @Test
    void test() {
        Ch_01 a = new Ch_01();

        List<Integer> list =  Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        assertEquals(4, a.solution(list, 5));

    }

}
