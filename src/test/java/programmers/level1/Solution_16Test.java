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
class Solution_16Test {

	private final Solution_16 solution = new Solution_16();

	@Builder
	@Getter
	private static class TestCase {
		String s;
		boolean expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.s("a234")
				.expected(false)
				.build();

		assertThat(solution.solution(testCase.getS())).isEqualTo(testCase.isExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.s("1234")
				.expected(true)
				.build();

		assertThat(solution.solution(testCase.getS())).isEqualTo(testCase.isExpected());
	}
}