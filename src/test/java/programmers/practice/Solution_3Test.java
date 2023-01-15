package programmers.practice;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-15
 **/
class Solution_3Test {

	private final Solution_3 solution = new Solution_3();

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
				.a(new int[]{5, 1, 3, 7})
				.b(new int[]{2, 2, 6, 8})
				.expected(3)
				.build();

		assertThat(solution.solution(testCase.getA(), testCase.getB())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.a(new int[]{2, 2, 2, 2})
				.b(new int[]{1, 1, 1, 1})
				.expected(0)
				.build();

		assertThat(solution.solution(testCase.getA(), testCase.getB())).isEqualTo(testCase.getExpected());
	}
}