package programmers.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-15
 **/
class Solution_12Test {

    private final Solution_12 solution = new Solution_12();

    @Builder
    @Getter
    private static class TestCase {
        int[] arr;
        int[] expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .arr(new int[]{1, 1, 3, 3, 0, 1, 1})
            .expected(new int[]{1, 3, 0, 1})
            .build();

        assertThat(solution.solution(testCase.getArr())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .arr(new int[]{4, 4, 4, 3, 3})
            .expected(new int[]{4, 3})
            .build();

        assertThat(solution.solution(testCase.getArr())).isEqualTo(testCase.getExpected());
    }
}
