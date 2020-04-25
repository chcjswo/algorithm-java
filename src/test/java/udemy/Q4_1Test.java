package udemy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by chcjswo on 2020-04-24
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
class Q4_1Test {

    @Test
    public void test() {
        Q4_1 q4_1 = new Q4_1();

        assertEquals(123, q4_1.string2int("123") );
        assertEquals(443322, q4_1.string2int("443322"));
    }
}
