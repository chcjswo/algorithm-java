package programmers.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-05
 **/
class Solution_45Test {

    private final Solution_45 solution = new Solution_45();

    @Builder
    @Getter
    private static class TestCase {
        int chicken;
        int expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .chicken(100)
            .expected(11)
            .build();

        assertThat(solution.solution(testCase.getChicken())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .chicken(1081)
            .expected(120)
            .build();

        assertThat(solution.solution(testCase.getChicken())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_3() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .chicken(1999)
            .expected(222)
            .build();

        assertThat(solution.solution(testCase.getChicken())).isEqualTo(testCase.getExpected());
    }
}
