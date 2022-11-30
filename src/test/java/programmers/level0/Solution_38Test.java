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
class Solution_38Test {

	private final Solution_38 solution = new Solution_38();

	@Builder
	@Getter
	private static class TestCase {
		String s;
		int expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.s("aAb1B2cC34oOp")
				.expected(37)
				.build();

		assertThat(solution.solution(testCase.getS())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.s("1a2b3c4d123Z")
				.expected(133)
				.build();

		assertThat(solution.solution(testCase.getS())).isEqualTo(testCase.getExpected());
	}
}