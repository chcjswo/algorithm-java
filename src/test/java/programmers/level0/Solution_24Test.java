package programmers.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-11-21
 **/
class Solution_24Test {

    private final Solution_24 solution = new Solution_24();

    @Builder
    @Getter
    private static class TestCase {
        int[] sides;
        int expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .sides(new int[]{1, 2, 3})
            .expected(2)
            .build();

        assertThat(solution.solution(testCase.getSides())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .sides(new int[]{3, 6, 2})
            .expected(2)
            .build();

        assertThat(solution.solution(testCase.getSides())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_3() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .sides(new int[]{199, 72, 222})
            .expected(1)
            .build();

        assertThat(solution.solution(testCase.getSides())).isEqualTo(testCase.getExpected());
    }

}
