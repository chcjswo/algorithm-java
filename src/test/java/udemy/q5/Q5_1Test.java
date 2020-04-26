package udemy.q5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by chcjswo on 2020-04-26
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
class Q5_1Test {

	@Test
	void countWays() {
	    Q5_1 q5_1 = new Q5_1();

	    assertEquals(4, q5_1.countWays(3));
	    assertEquals(8, q5_1.countWays(4));
	}
}
