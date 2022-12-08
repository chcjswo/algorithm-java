package programmers.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-08
 **/
class Solution_49Test {

    private final Solution_49 solution = new Solution_49();

    @Builder
    @Getter
    private static class TestCase {
        String[] keyinput;
        int[] board;
        int[] expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .keyinput(new String[]{"left", "right", "up", "right", "right"})
            .board(new int[]{11, 11})
            .expected(new int[]{2, 1})
            .build();

        assertThat(solution.solution(testCase.getKeyinput(), testCase.getBoard())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .keyinput(new String[]{"down", "down", "down", "down", "down"})
            .board(new int[]{7, 9})
            .expected(new int[]{0, -4})
            .build();

        assertThat(solution.solution(testCase.getKeyinput(), testCase.getBoard())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_3() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .keyinput(new String[]{"left", "left", "left", "right"})
            .board(new int[]{3, 3})
            .expected(new int[]{0, 0})
            .build();

        assertThat(solution.solution(testCase.getKeyinput(), testCase.getBoard())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_4() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .keyinput(new String[]{"up", "up", "up", "down"})
            .board(new int[]{3, 3})
            .expected(new int[]{0, 0})
            .build();

        assertThat(solution.solution(testCase.getKeyinput(), testCase.getBoard())).isEqualTo(testCase.getExpected());
    }
}
