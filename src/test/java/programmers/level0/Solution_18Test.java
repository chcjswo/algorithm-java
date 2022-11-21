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
class Solution_18Test {

    private final Solution_18 solution = new Solution_18();

    @Builder
    @Getter
    private static class TestCase {
        int[] array;
        int n;
        int expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .array(new int[]{1, 1, 2, 3, 4, 5})
            .n(1)
            .expected(2)
            .build();

        assertThat(solution.solution(testCase.getArray(), testCase.getN())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .array(new int[]{0, 2, 3, 4})
            .n(1)
            .expected(0)
            .build();

        assertThat(solution.solution(testCase.getArray(), testCase.getN())).isEqualTo(testCase.getExpected());
    }
}
