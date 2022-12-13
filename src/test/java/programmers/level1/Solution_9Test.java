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
 * @since 2022-12-13
 **/
class Solution_9Test {

	private final Solution_9 solution = new Solution_9();

	@Builder
	@Getter
	private static class TestCase {
		int[] arr;
		int[] expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.arr(new int[]{4, 3, 2, 1})
				.expected(new int[]{4, 3, 2})
				.build();

		assertThat(solution.solution(testCase.getArr())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.arr(new int[]{10})
				.expected(new int[]{-1})
				.build();

		assertThat(solution.solution(testCase.getArr())).isEqualTo(testCase.getExpected());
	}
}