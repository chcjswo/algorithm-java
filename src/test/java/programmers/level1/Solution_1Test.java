package programmers.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-11-22
 **/
class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Builder
    @Getter
    private static class TestCase {
        int[] food;
        String expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .food(new int[]{1, 3, 4, 6})
            .expected("1223330333221")
            .build();

        assertThat(solution.solution(testCase.getFood())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .food(new int[]{1, 7, 1, 2})
            .expected("111303111")
            .build();

        assertThat(solution.solution(testCase.getFood())).isEqualTo(testCase.getExpected());
    }
}


