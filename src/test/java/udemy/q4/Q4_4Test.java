package udemy.q4;

import org.junit.jupiter.api.Test;
import udemy.q4.Q4_4;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by chcjswo on 2020-04-26
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
class Q4_4Test {

	@Test
	void coding() {
	    Q4_4 q4_4 = new Q4_4();

	    assertEquals("a1b2c3", q4_4.coding("abbccc"));
	    assertEquals("a3c4", q4_4.coding("aaacccc"));
        assertEquals("a1b2c3", q4_4.coding2("abbccc"));
        assertEquals("a3c4", q4_4.coding2("aaacccc"));
	}
}
