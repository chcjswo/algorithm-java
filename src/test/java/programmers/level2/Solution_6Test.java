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
 * @since 2023-01-15
 **/
class Solution_6Test {

	private final Solution_6 solution = new Solution_6();

	@Builder
	@Getter
	private static class TestCase {
		String[][] clothes;
		int expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.clothes(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}})
				.expected(5)
				.build();

		assertThat(solution.solution(testCase.getClothes())).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.clothes(new String[][]{{"k", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}})
				.expected(3)
				.build();

		assertThat(solution.solution(testCase.getClothes())).isEqualTo(testCase.getExpected());
	}
}