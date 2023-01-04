package programmers.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author mcjeon
 * @version 1.0.0
 * @since 2023-01-04
 **/
class Solution_15Test {

    private final Solution_15 solution = new Solution_15();

    @Builder
    @Getter
    private static class TestCase {
        int[] nums;
        int expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .nums(new int[]{3, 1, 2, 3})
            .expected(2)
            .build();

        assertThat(solution.solution(testCase.getNums())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .nums(new int[]{3, 3, 3, 2, 2, 4})
            .expected(3)
            .build();

        assertThat(solution.solution(testCase.getNums())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_3() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .nums(new int[]{3, 3, 3, 2, 2, 2})
            .expected(2)
            .build();

        assertThat(solution.solution(testCase.getNums())).isEqualTo(testCase.getExpected());
    }
}
