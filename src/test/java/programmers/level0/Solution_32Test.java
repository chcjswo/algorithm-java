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
 * @since 2022-11-26
 **/
class Solution_32Test {

	private final Solution_32 solution = new Solution_32();

	@Builder
	@Getter
	private static class TestCase {
		int[] numbers;
		String direction;
		int[] expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.numbers(new int[]{1, 2, 3})
				.direction("right")
				.expected(new int[]{3, 1, 2})
				.build();

		assertThat(solution.solution(testCase.getNumbers(), testCase.getDirection())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.numbers(new int[]{4, 455, 6, 4, -1, 45, 6})
				.direction("left")
				.expected(new int[]{455, 6, 4, -1, 45, 6, 4})
				.build();

		assertThat(solution.solution(testCase.getNumbers(), testCase.getDirection())).isEqualTo(testCase.getExpected());
	}
}