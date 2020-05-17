package udemy.q8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by chcjswo on 2020-05-17
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
class Q8_2Test {

    @Test
    void test() {
        Q8_2<String> q8_2 = new Q8_2<>();

        q8_2.push("a");
        assertEquals("a", q8_2.pop());
    }
}
