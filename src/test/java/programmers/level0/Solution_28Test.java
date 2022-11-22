package programmers.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-11-22
 **/
class Solution_28Test {

    private final Solution_28 solution = new Solution_28();

    @Builder
    @Getter
    private static class TestCase {
        String rsp;
        String expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .rsp("2")
            .expected("0")
            .build();

        assertThat(solution.solution(testCase.getRsp())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .rsp("205")
            .expected("052")
            .build();

        assertThat(solution.solution(testCase.getRsp())).isEqualTo(testCase.getExpected());
    }
}
