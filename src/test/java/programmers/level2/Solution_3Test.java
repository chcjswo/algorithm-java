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
 * @since 2023-01-08
 **/
class Solution_3Test {

	private final Solution_3 solution = new Solution_3();

	@Builder
	@Getter
	private static class TestCase {
		String s;
		String expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.s("3people unFollowed me")
				.expected("3people Unfollowed Me")
				.build();

		assertThat(solution.solution(testCase.getS())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.s("for the last week")
				.expected("For The Last Week")
				.build();

		assertThat(solution.solution(testCase.getS())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_3() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.s("for  the last week")
				.expected("For  The Last Week")
				.build();

		assertThat(solution.solution(testCase.getS())).isEqualTo(testCase.getExpected());
	}
}