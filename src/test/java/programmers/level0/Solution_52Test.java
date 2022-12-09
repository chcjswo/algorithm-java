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
 * @since 2022-12-09
 **/
class Solution_52Test {

	private final Solution_52 solution = new Solution_52();

	@Builder
	@Getter
	private static class TestCase {
		int[] common;
		int expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.common(new int[]{1, 2, 3, 4})
				.expected(5)
				.build();

		assertThat(solution.solution(testCase.getCommon())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.common(new int[]{2, 4, 8})
				.expected(16)
				.build();

		assertThat(solution.solution(testCase.getCommon())).isEqualTo(testCase.getExpected());
	}
}