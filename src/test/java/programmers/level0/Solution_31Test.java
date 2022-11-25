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
 * @since 2022-11-25
 **/
class Solution_31Test {

	private final Solution_31 solution = new Solution_31();

	@Builder
	@Getter
	private static class TestCase {
		int[] list;
		int n;
		int[][] expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.list(new int[]{1, 2, 3, 4, 5, 6, 7, 8})
				.n(2)
				.expected(new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}})
				.build();

		assertThat(solution.solution(testCase.getList(), testCase.getN())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.list(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948})
				.n(3)
				.expected(new int[][]{{100, 95, 2}, {4, 5, 6}, {18, 33, 948}})
				.build();

		assertThat(solution.solution(testCase.getList(), testCase.getN())).isEqualTo(testCase.getExpected());
	}

}
