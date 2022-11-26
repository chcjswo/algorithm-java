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
class Solution_34Test {

	private final Solution_34 solution = new Solution_34();

	@Builder
	@Getter
	private static class TestCase {
		String cipher;
		int code;
		String expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.cipher("dfjardstddetckdaccccdegk")
				.code(4)
				.expected("attack")
				.build();

		assertThat(solution.solution(testCase.getCipher(), testCase.getCode())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.cipher("pfqallllabwaoclk")
				.code(2)
				.expected("fallback")
				.build();

		assertThat(solution.solution(testCase.getCipher(), testCase.getCode())).isEqualTo(testCase.getExpected());
	}
}