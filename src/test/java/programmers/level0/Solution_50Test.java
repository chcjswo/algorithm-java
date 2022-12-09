package programmers.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-09
 **/
class Solution_50Test {

    private final Solution_50 solution = new Solution_50();

    @Builder
    @Getter
    private static class TestCase {
        String polynomial;
        String expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .polynomial("3x + 7 + x")
            .expected("4x + 7")
            .build();

        assertThat(solution.solution(testCase.getPolynomial())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .polynomial("x + x + x")
            .expected("3x")
            .build();

        assertThat(solution.solution(testCase.getPolynomial())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_3() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .polynomial("10x + x")
            .expected("11x")
            .build();

        assertThat(solution.solution(testCase.getPolynomial())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_4() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .polynomial("x + 1")
            .expected("x + 1")
            .build();

        assertThat(solution.solution(testCase.getPolynomial())).isEqualTo(testCase.getExpected());
    }
}
