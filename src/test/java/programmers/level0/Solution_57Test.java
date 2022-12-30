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
 * @since 2022-12-30
 **/
class Solution_57Test {

	private final Solution_57 solution = new Solution_57();

	@Builder
	@Getter
	private static class TestCase {
		String a;
		String b;
		int expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.a("hello")
				.b("ohell")
				.expected(1)
				.build();

		assertThat(solution.solution(testCase.getA(), testCase.getB())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.a("apple")
				.b("elppa")
				.expected(-1)
				.build();

		assertThat(solution.solution(testCase.getA(), testCase.getB())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_4() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.a("hello")
				.b("elloh")
				.expected(4)
				.build();

		assertThat(solution.solution(testCase.getA(), testCase.getB())).isEqualTo(testCase.getExpected());
	}
}