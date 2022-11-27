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
 * @since 2022-11-28
 **/
class Solution_35Test {

	private final Solution_35 solution = new Solution_35();

	@Builder
	@Getter
	private static class TestCase {
		String s;
		String expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.s("abcabcadc")
				.expected("d")
				.build();

		assertThat(solution.solution(testCase.getS())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.s("abdc")
				.expected("abcd")
				.build();

		assertThat(solution.solution(testCase.getS())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_3() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.s("hello")
				.expected("eho")
				.build();

		assertThat(solution.solution(testCase.getS())).isEqualTo(testCase.getExpected());
	}
}