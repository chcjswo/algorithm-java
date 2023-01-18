package programmers.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-18
 **/
class Solution_8Test {

	private final Solution_8 solution = new Solution_8();

	@Builder
	@Getter
	private static class TestCase {
		String s;
		int[] expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.s("110010101001")
				.expected(new int[]{3, 8})
				.build();

		assertThat(solution.solution(testCase.getS())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.s("01110")
				.expected(new int[]{3, 3})
				.build();

		assertThat(solution.solution(testCase.getS())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_3() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.s("1111111")
				.expected(new int[]{4, 1})
				.build();

		assertThat(solution.solution(testCase.getS())).isEqualTo(testCase.getExpected());
	}

}