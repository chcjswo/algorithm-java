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
class Solution_12Test {

    private final Solution_12 solution = new Solution_12();

    @Getter
    @Builder
    private static class TestCase {
        int[] numbers;
        int[] expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .numbers(new int[]{1, 2, 3, 4, 5})
            .expected(new int[]{5, 4, 3, 2, 1})
            .build();

        assertThat(solution.solution(testCase.getNumbers())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .numbers(new int[]{1, 1, 1, 1, 1, 2})
            .expected(new int[]{2, 1, 1, 1, 1, 1})
            .build();

        assertThat(solution.solution(testCase.getNumbers())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_3() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .numbers(new int[]{1, 0, 1, 1, 1, 3, 5})
            .expected(new int[]{5, 3, 1, 1, 1, 0, 1})
            .build();

        assertThat(solution.solution(testCase.getNumbers())).isEqualTo(testCase.getExpected());
    }

}
