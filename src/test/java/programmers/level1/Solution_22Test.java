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
 * @since 2023-01-20
 **/
class Solution_22Test {

	private final Solution_22 solution = new Solution_22();

	@Builder
	@Getter
	private static class TestCase {
		int n;
		int expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.n(45)
				.expected(7)
				.build();

		assertThat(solution.solution(testCase.getN())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.n(125)
				.expected(229)
				.build();

		assertThat(solution.solution(testCase.getN())).isEqualTo(testCase.getExpected());
	}

}