package programmers.level2;

import java.util.Arrays;

/**
 * 전화번호 목록
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-05
 **/
public class Solution_2 {
	public boolean solution(String[] phone_book) {
		Arrays.sort(phone_book);
		for (int i = 1; i < phone_book.length; i++) {
			if (phone_book[i].startsWith(phone_book[i - 1])) {
				return false;
			}
		}
		return true;
	}
}
