package programmers.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-13
 **/
class Solution_8Test {

    private final Solution_8 solution = new Solution_8();

    @Builder
    @Getter
    private static class TestCase {
        int[] arr;
        int divisor;
        int[] expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .arr(new int[]{5, 9, 7, 10})
            .divisor(5)
            .expected(new int[]{5, 10})
            .build();

        assertThat(solution.solution(testCase.getArr(), testCase.getDivisor())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .arr(new int[]{2, 36, 1, 3})
            .divisor(1)
            .expected(new int[]{1, 2, 3, 36})
            .build();

        assertThat(solution.solution(testCase.getArr(), testCase.getDivisor())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_3() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .arr(new int[]{3, 2, 6})
            .divisor(10)
            .expected(new int[]{-1})
            .build();

        assertThat(solution.solution(testCase.getArr(), testCase.getDivisor())).isEqualTo(testCase.getExpected());
    }
}
