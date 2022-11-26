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
class Solution_33Test {

	private final Solution_33 solution = new Solution_33();

	@Builder
	@Getter
	private static class TestCase {
		int[] numbers;
		int k;
		int expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.numbers(new int[]{1, 2, 3, 4})
				.k(2)
				.expected(3)
				.build();

		assertThat(solution.solution(testCase.getNumbers(), testCase.getK())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.numbers(new int[]{1, 2, 3, 4, 5, 6})
				.k(5)
				.expected(3)
				.build();

		assertThat(solution.solution(testCase.getNumbers(), testCase.getK())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_3() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.numbers(new int[]{1, 2, 3})
				.k(3)
				.expected(2)
				.build();

		assertThat(solution.solution(testCase.getNumbers(), testCase.getK())).isEqualTo(testCase.getExpected());
	}
}