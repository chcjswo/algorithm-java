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
 * @since 2023-01-09
 **/
class Solution_58Test {

	private final Solution_58 solution = new Solution_58();

	@Builder
	@Getter
	private static class TestCase {
		int[] numlist;
		int n;
		int[] expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.numlist(new int[]{1, 2, 3, 4, 5, 6})
				.n(4)
				.expected(new int[]{4, 5, 3, 6, 2, 1})
				.build();

		assertThat(solution.solution(testCase.getNumlist(), testCase.getN())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.numlist(new int[]{10000, 20, 36, 47, 40, 6, 10, 7000})
				.n(30)
				.expected(new int[]{36, 40, 20, 47, 10, 6, 7000, 10000})
				.build();

		assertThat(solution.solution(testCase.getNumlist(), testCase.getN())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_3() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.numlist(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 11})
				.n(6)
				.expected(new int[]{6, 7, 5, 8, 4, 9, 3, 10, 2, 11, 1})
				.build();

		assertThat(solution.solution(testCase.getNumlist(), testCase.getN())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_4() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.numlist(new int[]{600, 400, 300, 200, 700, 800, 100, 900})
				.n(500)
				.expected(new int[]{600, 400, 700, 300, 800, 200, 900, 100})
				.build();

		assertThat(solution.solution(testCase.getNumlist(), testCase.getN())).isEqualTo(testCase.getExpected());
	}
}