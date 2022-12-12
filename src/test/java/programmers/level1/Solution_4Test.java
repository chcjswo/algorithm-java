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
class Solution_4Test {

    private final Solution_4 solution = new Solution_4();

    @Builder
    @Getter
    private static class TestCase {
        String s;
        boolean expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .s("pPoooyY")
            .expected(true)
            .build();

        assertThat(solution.solution(testCase.getS())).isEqualTo(testCase.isExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .s("Pyy")
            .expected(false)
            .build();

        assertThat(solution.solution(testCase.getS())).isEqualTo(testCase.isExpected());
    }
}
