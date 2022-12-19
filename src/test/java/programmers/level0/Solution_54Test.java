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
class Solution_54Test {

	private final Solution_54 solution = new Solution_54();

	@Builder
	@Getter
	private static class TestCase {
		int[][] score;
		int[] expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.score(new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}})
				.expected(new int[]{1, 2, 4, 3})
				.build();

		assertThat(solution.solution(testCase.getScore())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.score(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}})
				.expected(new int[]{4, 4, 6, 2, 2, 1, 7})
				.build();

		assertThat(solution.solution(testCase.getScore())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_3() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.score(new int[][]{{1, 1}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {6, 1}, {7, 1}, {8, 1}, {9, 1}, {0, 0}})
				.expected(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 10})
				.build();

		assertThat(solution.solution(testCase.getScore())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_4() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.score(new int[][]{{1, 2}, {1, 1}, {1, 1}})
				.expected(new int[]{1, 2, 2})
				.build();

		assertThat(solution.solution(testCase.getScore())).isEqualTo(testCase.getExpected());
	}

}