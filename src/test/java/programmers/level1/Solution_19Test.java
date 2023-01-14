package programmers.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-14
 **/
class Solution_19Test {

	private final Solution_19 solution = new Solution_19();

	@Builder
	@Getter
	private static class TestCase {
		int n;
		int m;
		int[] expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.n(3)
				.m(12)
				.expected(new int[]{3, 12})
				.build();

		assertThat(solution.solution(testCase.getN(), testCase.getM())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.n(2)
				.m(5)
				.expected(new int[]{1, 10})
				.build();

		assertThat(solution.solution(testCase.getN(), testCase.getM())).isEqualTo(testCase.getExpected());
	}
}