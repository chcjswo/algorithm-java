package programmers.practice;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-15
 **/
class Solution_2Test {

	private final Solution_2 solution = new Solution_2();

	@Builder
	@Getter
	private static class TestCase {
		int[] d;
		int budget;
		int expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.d(new int[]{1, 3, 2, 5, 4})
				.budget(9)
				.expected(3)
				.build();

		assertThat(solution.solution(testCase.getD(), testCase.budget)).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.d(new int[]{2, 2, 3, 3})
				.budget(10)
				.expected(4)
				.build();

		assertThat(solution.solution(testCase.getD(), testCase.budget)).isEqualTo(testCase.getExpected());
	}
}