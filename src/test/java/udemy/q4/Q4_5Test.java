package udemy.q4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by chcjswo on 2020-04-26
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
class Q4_5Test {

	@Test
	void getCount() {
        Q4_5 q4_5 = new Q4_5();
        String word = "aaa bbb ccc aaa ddd";

        q4_5.read(word.split(" "));

        assertEquals(2, q4_5.getCount("aaa"));
        assertEquals(1, q4_5.getCount("bbb"));
	}
}
