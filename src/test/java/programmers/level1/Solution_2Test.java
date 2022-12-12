package programmers.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-12
 **/
class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Builder
    @Getter
    private static class TestCase {
        int n;
        int expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .n(123)
            .expected(6)
            .build();

        assertThat(solution.solution(testCase.getN())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .n(987)
            .expected(24)
            .build();

        assertThat(solution.solution(testCase.getN())).isEqualTo(testCase.getExpected());
    }
}
