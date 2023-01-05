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
class Solution_1Test {

	private final Solution_1 solution = new Solution_1();

	@Builder
	@Getter
	private static class TestCase {
		String s;
		boolean expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.s("()()")
				.expected(true)
				.build();

		assertThat(solution.solution(testCase.getS())).isEqualTo(testCase.isExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.s("(())()")
				.expected(true)
				.build();

		assertThat(solution.solution(testCase.getS())).isEqualTo(testCase.isExpected());
	}

	@Test
	void test_3() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.s(")()(")
				.expected(false)
				.build();

		assertThat(solution.solution(testCase.getS())).isEqualTo(testCase.isExpected());
	}

	@Test
	void test_4() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.s("(()(")
				.expected(false)
				.build();

		assertThat(solution.solution(testCase.getS())).isEqualTo(testCase.isExpected());
	}
}