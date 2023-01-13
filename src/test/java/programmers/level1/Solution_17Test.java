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
 * @since 2023-01-13
 **/
class Solution_17Test {

	private final Solution_17 solution = new Solution_17();

	@Builder
	@Getter
	private static class TestCase {
		String s;
		String expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.s("1 2 3 4")
				.expected("1 4")
				.build();

		assertThat(solution.solution(testCase.getS())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.s("-1 -2 -3 -4")
				.expected("-4 -1")
				.build();

		assertThat(solution.solution(testCase.getS())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_3() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.s("-1 -1")
				.expected("-1 -1")
				.build();

		assertThat(solution.solution(testCase.getS())).isEqualTo(testCase.getExpected());
	}
}