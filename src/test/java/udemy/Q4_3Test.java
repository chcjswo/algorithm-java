package udemy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by chcjswo on 2020-04-25
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
class Q4_3Test {

	@Test
	void isAnagram() {
	    Q4_3 q4_3 = new Q4_3();

	    assertTrue(q4_3.isAnagram("ab", "ba"));
        assertTrue(q4_3.isAnagram("abc", "bac"));
        assertFalse(q4_3.isAnagram("abc", "bad"));
        assertFalse(q4_3.isAnagram("car", "ard"));
	}
}
