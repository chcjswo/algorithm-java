package udemy.q8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by chcjswo on 2020-05-06
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
class Q8_1Test {
    @Test
    public void stackTest() {
        Q8_1 q8_1 = new Q8_1();

        q8_1.push(1);
        q8_1.push(2);
        q8_1.push(3);
        assertEquals(3, q8_1.pop());
        assertEquals(2, q8_1.pop());
        assertEquals(1, q8_1.pop());

        Throwable thrown = assertThrows(RuntimeException.class, q8_1::pop);
        assertEquals("runtime exception", thrown.getMessage());
    }
}
