package programmers.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-07
 **/
class Solution_48Test {

    private final Solution_48 solution = new Solution_48();

    @Builder
    @Getter
    private static class TestCase {
        int[][] dots;
        int expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .dots(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}})
            .expected(1)
            .build();

        assertThat(solution.solution(testCase.getDots())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .dots(new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}})
            .expected(4)
            .build();

        assertThat(solution.solution(testCase.getDots())).isEqualTo(testCase.getExpected());
    }
}
