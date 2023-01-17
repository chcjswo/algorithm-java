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
 * @since 2023-01-18
 **/
class Solution_7Test {

	private final Solution_7 solution = new Solution_7();

	@Builder
	@Getter
	private static class TestCase {
		String skill;
		String[] skill_trees;
		int expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.skill("CBD")
				.skill_trees(new String[]{"BACDE", "CBADF", "AECB", "BDA"})
				.expected(2)
				.build();

		assertThat(solution.solution(testCase.getSkill(), testCase.getSkill_trees())).isEqualTo(testCase.getExpected());
	}
}