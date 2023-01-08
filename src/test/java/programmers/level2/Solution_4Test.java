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
class Solution_4Test {

	private final Solution_4 solution = new Solution_4();

	@Builder
	@Getter
	private static class TestCase {
		int[] citations;
		int expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.citations(new int[]{3, 0, 6, 1, 5})
				.expected(3)
				.build();

		assertThat(solution.solution(testCase.getCitations())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.citations(new int[]{10, 10, 10, 10, 10})
				.expected(5)
				.build();

		assertThat(solution.solution(testCase.getCitations())).isEqualTo(testCase.getExpected());
	}
}