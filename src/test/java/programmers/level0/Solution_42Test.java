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
 * @since 2022-12-03
 **/
class Solution_42Test {

	private final Solution_42 solution = new Solution_42();

	@Builder
	@Getter
	private static class TestCase {
		int n;
		int expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.n(3628800)
				.expected(10)
				.build();

		assertThat(solution.solution(testCase.getN())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.n(7)
				.expected(3)
				.build();

		assertThat(solution.solution(testCase.getN())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_3() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.n(24)
				.expected(4)
				.build();

		assertThat(solution.solution(testCase.getN())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_4() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.n(5)
				.expected(2)
				.build();

		assertThat(solution.solution(testCase.getN())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_5() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.n(3)
				.expected(2)
				.build();

		assertThat(solution.solution(testCase.getN())).isEqualTo(testCase.getExpected());
	}
}