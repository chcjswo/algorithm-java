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
 * @since 2023-01-14
 **/
class Solution_21Test {

	private final Solution_21 solution = new Solution_21();

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
				.a(new int[]{1, 4, 2})
				.b(new int[]{5, 4, 4})
				.expected(29)
				.build();

		assertThat(solution.solution(testCase.getA(), testCase.getB())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.a(new int[]{1, 2})
				.b(new int[]{3, 4})
				.expected(10)
				.build();

		assertThat(solution.solution(testCase.getA(), testCase.getB())).isEqualTo(testCase.getExpected());
	}
}