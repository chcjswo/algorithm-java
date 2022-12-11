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
 * @since 2022-12-11
 **/
class Solution_56Test {

	private final Solution_56 solution = new Solution_56();

	@Builder
	@Getter
	private static class TestCase {
		int a;
		int b;
		int expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.a(7)
				.b(20)
				.expected(1)
				.build();

		assertThat(solution.solution(testCase.getA(), testCase.getB())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.a(11)
				.b(22)
				.expected(1)
				.build();

		assertThat(solution.solution(testCase.getA(), testCase.getB())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_3() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.a(12)
				.b(21)
				.expected(2)
				.build();

		assertThat(solution.solution(testCase.getA(), testCase.getB())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_4() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.a(3500)
				.b(500)
				.expected(1)
				.build();

		assertThat(solution.solution(testCase.getA(), testCase.getB())).isEqualTo(testCase.getExpected());
	}
}