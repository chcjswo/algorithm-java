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
 * @since 2022-12-12
 **/
class Solution_5Test {

	private final Solution_5 solution = new Solution_5();

	@Builder
	@Getter
	private static class TestCase {
		int x;
		boolean expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.x(10)
				.expected(true)
				.build();

		assertThat(solution.solution(testCase.getX())).isEqualTo(testCase.isExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.x(12)
				.expected(true)
				.build();

		assertThat(solution.solution(testCase.getX())).isEqualTo(testCase.isExpected());
	}

	@Test
	void test_3() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.x(11)
				.expected(false)
				.build();

		assertThat(solution.solution(testCase.getX())).isEqualTo(testCase.isExpected());
	}

	@Test
	void test_4() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.x(13)
				.expected(false)
				.build();

		assertThat(solution.solution(testCase.getX())).isEqualTo(testCase.isExpected());
	}
}