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
 * @since 2022-12-10
 **/
class Solution_53Test {

	private final Solution_53 solution = new Solution_53();

	@Builder
	@Getter
	private static class TestCase {
		int[] sides;
		int expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.sides(new int[]{1, 2})
				.expected(1)
				.build();

		assertThat(solution.solution(testCase.getSides())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.sides(new int[]{3, 6})
				.expected(5)
				.build();

		assertThat(solution.solution(testCase.getSides())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_3() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.sides(new int[]{11, 7})
				.expected(13)
				.build();

		assertThat(solution.solution(testCase.getSides())).isEqualTo(testCase.getExpected());
	}
}