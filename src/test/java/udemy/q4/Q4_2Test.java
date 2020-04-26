package udemy.q4;

import org.junit.jupiter.api.Test;
import udemy.q4.Q4_2;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by chcjswo on 2020-04-24
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
class Q4_2Test {

	@Test
	void isUniqChar() {
	    Q4_2 q4_2 = new Q4_2();

	    assertTrue(q4_2.isUniqChar("abcd"));
	    assertTrue(q4_2.isUniqChar("abcdef"));
	    assertFalse(q4_2.isUniqChar("abcc"));
	    assertFalse(q4_2.isUniqChar("abbcc"));
	}
}
