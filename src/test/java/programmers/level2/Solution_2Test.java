package programmers.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-05
 **/
class Solution_2Test {

	private final Solution_2 solution = new Solution_2();

	@Builder
	@Getter
	private static class TestCase {
		String[] books;
		boolean expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.books(new String[]{"119", "97674223", "1195524421"})
				.expected(false)
				.build();

		assertThat(solution.solution(testCase.getBooks())).isEqualTo(testCase.isExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.books(new String[]{"123", "456", "789"})
				.expected(true)
				.build();

		assertThat(solution.solution(testCase.getBooks())).isEqualTo(testCase.isExpected());
	}

	@Test
	void test_3() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.books(new String[]{"12", "123", "1235", "567", "88"})
				.expected(false)
				.build();

		assertThat(solution.solution(testCase.getBooks())).isEqualTo(testCase.isExpected());
	}
}