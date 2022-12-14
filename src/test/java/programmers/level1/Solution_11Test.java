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
 * @since 2022-12-14
 **/
class Solution_11Test {

	private final Solution_11 solution = new Solution_11();

	@Builder
	@Getter
	private static class TestCase {
		int[] a;
		int[] b;
		int expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.a(new int[]{1, 2, 3, 4})
				.b(new int[]{-3, -1, 0, 2})
				.expected(3)
				.build();

		assertThat(solution.solution(testCase.getA(), testCase.getB())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.a(new int[]{-1, 0, 1})
				.b(new int[]{1, 0, -1})
				.expected(-2)
				.build();

		assertThat(solution.solution(testCase.getA(), testCase.getB())).isEqualTo(testCase.getExpected());
	}
}