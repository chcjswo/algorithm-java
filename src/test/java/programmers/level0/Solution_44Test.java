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
 * @since 2022-12-04
 **/
class Solution_44Test {

	private final Solution_44 solution = new Solution_44();

	@Builder
	@Getter
	private static class TestCase {
		int i;
		int j;
		int k;
		int expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.i(1)
				.j(13)
				.k(1)
				.expected(6)
				.build();

		assertThat(solution.solution(testCase.getI(), testCase.getJ(), testCase.getK())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.i(10)
				.j(50)
				.k(5)
				.expected(5)
				.build();

		assertThat(solution.solution(testCase.getI(), testCase.getJ(), testCase.getK())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_3() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.i(3)
				.j(10)
				.k(2)
				.expected(0)
				.build();

		assertThat(solution.solution(testCase.getI(), testCase.getJ(), testCase.getK())).isEqualTo(testCase.getExpected());
	}
}