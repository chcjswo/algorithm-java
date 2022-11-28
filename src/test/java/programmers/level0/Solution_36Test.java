package programmers.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-11-28
 **/
class Solution_36Test {

    private final Solution_36 solution = new Solution_36();

    @Builder
    @Getter
    private static class TestCase {
        String[] quiz;
        String[] expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .quiz(new String[]{"3 - 4 = -3", "5 + 6 = 11"})
            .expected(new String[]{"X", "O"})
            .build();

        assertThat(solution.solution(testCase.getQuiz())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .quiz(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"})
            .expected(new String[]{"O", "O", "X", "O"})
            .build();

        assertThat(solution.solution(testCase.getQuiz())).isEqualTo(testCase.getExpected());
    }
}
