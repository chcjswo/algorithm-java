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
class Solution_23Test {

    private final Solution_23 solution = new Solution_23();

    @Builder
    @Getter
    private static class TestCase {
        int[] emergency;
        int[] expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .emergency(new int[]{3, 76, 24})
            .expected(new int[]{3, 1, 2})
            .build();

        assertThat(solution.solution(testCase.getEmergency())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .emergency(new int[]{30, 10, 23, 6, 100})
            .expected(new int[]{2, 4, 3, 5, 1})
            .build();

        assertThat(solution.solution(testCase.getEmergency())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_3() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .emergency(new int[]{1, 2, 3, 4, 5, 6, 7})
            .expected(new int[]{7, 6, 5, 4, 3, 2, 1})
            .build();

        assertThat(solution.solution(testCase.getEmergency())).isEqualTo(testCase.getExpected());
    }

}
