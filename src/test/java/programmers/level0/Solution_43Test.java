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
 * @since 2022-12-04
 **/
class Solution_43Test {

	private final Solution_43 solution = new Solution_43();

	@Builder
	@Getter
	private static class TestCase {
		int[] array;
		int expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.array(new int[]{7, 77, 17})
				.expected(4)
				.build();

		assertThat(solution.solution(testCase.getArray())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.array(new int[]{10, 29})
				.expected(0)
				.build();

		assertThat(solution.solution(testCase.getArray())).isEqualTo(testCase.getExpected());
	}
}