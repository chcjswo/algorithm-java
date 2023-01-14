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
class Solution_20Test {

	private final Solution_20 solution = new Solution_20();

	@Builder
	@Getter
	private static class TestCase {
		int price;
		int money;
		int count;
		long expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.price(3)
				.money(20)
				.count(4)
				.expected(10)
				.build();

		assertThat(solution.solution(testCase.getPrice(), testCase.getMoney(), testCase.count)).isEqualTo(testCase.getExpected());
	}
}