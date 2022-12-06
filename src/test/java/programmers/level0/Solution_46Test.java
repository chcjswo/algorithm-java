package programmers.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-06
 **/
class Solution_46Test {

    private final Solution_46 solution = new Solution_46();

    @Builder
    @Getter
    private static class TestCase {
        int[] array;
        int n;
        int expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .array(new int[]{3, 10, 28})
            .n(20)
            .expected(28)
            .build();

        assertThat(solution.solution(testCase.getArray(), testCase.getN())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .array(new int[]{10, 11, 12})
            .n(13)
            .expected(12)
            .build();

        assertThat(solution.solution(testCase.getArray(), testCase.getN())).isEqualTo(testCase.getExpected());
    }
}
