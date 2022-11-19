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
class Solution_14Test {

    @Builder
    @Getter
    private static class TestCase {
        int[] nums;
        int[] expected;
    }

    private final Solution_14 solution = new Solution_14();

    @Test
    void solution() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .nums(new int[]{1, 2, 3, 4, 5})
            .expected(new int[]{2, 3})
            .build();

        assertThat(solution.solution(testCase.getNums())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .nums(new int[]{1, 3, 5, 7})
            .expected(new int[]{0, 4})
            .build();

        assertThat(solution.solution(testCase.getNums())).isEqualTo(testCase.getExpected());
    }
}
