package programmers.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-20
 **/
class Solution_16Test {

    private final Solution_16 solution = new Solution_16();

    @Builder
    @Getter
    private static class TestCase {
        int angle;
        int expected;
    }

    @Test
    void solution() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .angle(70)
            .expected(1)
            .build();

        assertThat(solution.solution(testCase.getAngle())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .angle(91)
            .expected(3)
            .build();

        assertThat(solution.solution(testCase.getAngle())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_3() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .angle(180)
            .expected(4)
            .build();

        assertThat(solution.solution(testCase.getAngle())).isEqualTo(testCase.getExpected());
    }
}
