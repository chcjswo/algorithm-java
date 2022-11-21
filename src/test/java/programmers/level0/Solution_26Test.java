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
 * @since 2022-11-22
 **/
class Solution_26Test {

    private final Solution_26 solution = new Solution_26();

    @Builder
    @Getter
    private static class TestCase {
        int n;
        int[] numlist;
        int[] expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .n(3)
            .numlist(new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12})
            .expected(new int[]{6, 9, 12})
            .build();

        assertThat(solution.solution(testCase.getN(), testCase.getNumlist())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .n(5)
            .numlist(new int[]{1, 9, 3, 10, 13, 5})
            .expected(new int[]{10, 5})
            .build();

        assertThat(solution.solution(testCase.getN(), testCase.getNumlist())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_3() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .n(12)
            .numlist(new int[]{2, 100, 120, 600, 12, 12})
            .expected(new int[]{120, 600, 12, 12})
            .build();

        assertThat(solution.solution(testCase.getN(), testCase.getNumlist())).isEqualTo(testCase.getExpected());
    }

}
