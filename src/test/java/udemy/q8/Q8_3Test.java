package udemy.q8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by chcjswo on 2020-05-17
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
class Q8_3Test {

	@Test
	void isPalindromeTest() {
	    Q8_3 q8_3 = new Q8_3();

	    assertFalse(q8_3.isPalindrome("moon"));
	    assertTrue(q8_3.isPalindrome("no3on"));
	    assertTrue(q8_3.isPalindrome("level"));
	    assertFalse(q8_3.isPalindrome("abcd"));
	}
}
