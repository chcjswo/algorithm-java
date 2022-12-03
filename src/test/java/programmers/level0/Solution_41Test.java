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
class Solution_41Test {

	private final Solution_41 solution = new Solution_41();

	@Builder
	@Getter
	private static class TestCase {
		int n;
		int expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.n(10)
				.expected(5)
				.build();

		assertThat(solution.solution(testCase.getN())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.n(15)
				.expected(8)
				.build();

		assertThat(solution.solution(testCase.getN())).isEqualTo(testCase.getExpected());
	}
}