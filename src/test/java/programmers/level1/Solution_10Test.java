package programmers.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-14
 **/
class Solution_10Test {

    private final Solution_10 solution = new Solution_10();

    @Builder
    @Getter
    private static class TestCase {
        int[] numbers;
        int expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .numbers(new int[]{1, 2, 3, 4, 6, 7, 8, 0})
            .expected(14)
            .build();

        assertThat(solution.solution(testCase.getNumbers())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .numbers(new int[]{5, 8, 4, 0, 6, 7, 9})
            .expected(6)
            .build();

        assertThat(solution.solution(testCase.getNumbers())).isEqualTo(testCase.getExpected());
    }
}
