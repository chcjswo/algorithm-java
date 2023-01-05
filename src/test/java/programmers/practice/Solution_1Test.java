package programmers.practice;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-06
 **/
class Solution_1Test {

	private final Solution_1 solution = new Solution_1();

	@Builder
	@Getter
	private static class TestCase {
		String[] words;
		boolean expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.words(new String[]{"tank", "kick", "know", "wheel", "land", "dream"})
				.expected(true)
				.build();

		assertThat(solution.solution(testCase.getWords())).isEqualTo(testCase.isExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.words(new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})
				.expected(false)
				.build();

		assertThat(solution.solution(testCase.getWords())).isEqualTo(testCase.isExpected());
	}
}