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
 * @since 2022-12-10
 **/
class Solution_55Test {

	private final Solution_55 solution = new Solution_55();

	@Builder
	@Getter
	private static class TestCase {
		int num;
		int total;
		int[] expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.num(3)
				.total(12)
				.expected(new int[]{3, 4, 5})
				.build();

		assertThat(solution.solution(testCase.getNum(), testCase.getTotal())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.num(5)
				.total(15)
				.expected(new int[]{1, 2, 3, 4, 5})
				.build();

		assertThat(solution.solution(testCase.getNum(), testCase.getTotal())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_3() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.num(4)
				.total(14)
				.expected(new int[]{2, 3, 4, 5})
				.build();

		assertThat(solution.solution(testCase.getNum(), testCase.getTotal())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_4() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.num(5)
				.total(5)
				.expected(new int[]{-1, 0, 1, 2, 3})
				.build();

		assertThat(solution.solution(testCase.getNum(), testCase.getTotal())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_5() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.num(3)
				.total(0)
				.expected(new int[]{-1, 0, 1})
				.build();

		assertThat(solution.solution(testCase.getNum(), testCase.getTotal())).isEqualTo(testCase.getExpected());
	}
}