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
class Solution_18Test {

	private final Solution_18 solution = new Solution_18();

	@Builder
	@Getter
	private static class TestCase {
		int left;
		int right;
		int expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.left(13)
				.right(17)
				.expected(43)
				.build();

		assertThat(solution.solution(testCase.getLeft(), testCase.getRight())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.left(24)
				.right(27)
				.expected(52)
				.build();

		assertThat(solution.solution(testCase.getLeft(), testCase.getRight())).isEqualTo(testCase.getExpected());
	}
}