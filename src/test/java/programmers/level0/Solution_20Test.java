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
 * @since 2022-11-21
 **/
class Solution_20Test {

    private final Solution_20 solution = new Solution_20();

    @Builder
    @Getter
    private static class TestCase {
        int[] dot;
        int expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .dot(new int[]{2, 4})
            .expected(1)
            .build();

        assertThat(solution.solution(testCase.getDot())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .dot(new int[]{-7, 9})
            .expected(2)
            .build();

        assertThat(solution.solution(testCase.getDot())).isEqualTo(testCase.getExpected());
    }

}
