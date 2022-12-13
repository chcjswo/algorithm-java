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
class Solution_7Test {

    private final Solution_7 solution = new Solution_7();

    @Builder
    @Getter
    private static class TestCase {
        int num;
        int expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .num(6)
            .expected(8)
            .build();

        assertThat(solution.solution(testCase.getNum())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .num(16)
            .expected(4)
            .build();

        assertThat(solution.solution(testCase.getNum())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_3() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .num(626331)
            .expected(-1)
            .build();

        assertThat(solution.solution(testCase.getNum())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_4() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .num(1)
            .expected(0)
            .build();

        assertThat(solution.solution(testCase.getNum())).isEqualTo(testCase.getExpected());
    }

}
