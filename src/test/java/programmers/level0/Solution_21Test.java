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
class Solution_21Test {

    private final Solution_21 solution = new Solution_21();

    @Builder
    @Getter
    private static class TestCase {
        int[] numbers;
        int expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .numbers(new int[]{1, 2, 3, 4, 5})
            .expected(20)
            .build();

        assertThat(solution.solution(testCase.getNumbers())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .numbers(new int[]{0, 31, 24, 10, 1, 9})
            .expected(744)
            .build();

        assertThat(solution.solution(testCase.getNumbers())).isEqualTo(testCase.getExpected());
    }
}
