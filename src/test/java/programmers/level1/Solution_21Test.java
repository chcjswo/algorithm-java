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
 * @since 2023-01-16
 **/
class Solution_21Test {

	private final Solution_21 solution = new Solution_21();

	@Builder
	@Getter
	private static class TestCase {
		int[][] arr1;
		int[][] arr2;
		int[][] expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.arr1(new int[][]{{1, 2}, {2, 3}})
				.arr2(new int[][]{{3, 4}, {5, 6}})
				.expected(new int[][]{{4, 6}, {7, 9}})
				.build();

		assertThat(solution.solution(testCase.getArr1(), testCase.getArr2())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.arr1(new int[][]{{1}, {2}})
				.arr2(new int[][]{{3}, {5}})
				.expected(new int[][]{{4}, {7}})
				.build();

		assertThat(solution.solution(testCase.getArr1(), testCase.getArr2())).isEqualTo(testCase.getExpected());
	}
}