package programmers.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-30
 **/
class Solution_37Test {

	private final Solution_37 solution = new Solution_37();

	@Builder
	@Getter
	private static class TestCase {
		int n;
		int[] expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.n(12)
				.expected(new int[]{2, 3})
				.build();

		assertThat(solution.solution(testCase.getN())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.n(17)
				.expected(new int[]{17})
				.build();

		assertThat(solution.solution(testCase.getN())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_3() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.n(420)
				.expected(new int[]{2, 3, 5, 7})
				.build();

		assertThat(solution.solution(testCase.getN())).isEqualTo(testCase.getExpected());
	}
}