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
class Solution_6Test {

    private final Solution_6 solution = new Solution_6();

    @Builder
    @Getter
    private static class TestCase {
        int a;
        int b;
        long expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .a(3)
            .b(5)
            .expected(12)
            .build();

        assertThat(solution.solution(testCase.getA(), testCase.getB())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .a(3)
            .b(3)
            .expected(3)
            .build();

        assertThat(solution.solution(testCase.getA(), testCase.getB())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_3() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .a(5)
            .b(3)
            .expected(12)
            .build();

        assertThat(solution.solution(testCase.getA(), testCase.getB())).isEqualTo(testCase.getExpected());
    }
}
