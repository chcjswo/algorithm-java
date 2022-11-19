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
class Solution_13Test {

    @Builder
    @Getter
    private static class TestCase {
        int money;
        int[] expected;
    }

    private final Solution_13 solution = new Solution_13();

    @Test
    void solution() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .money(5500)
            .expected(new int[]{1, 0})
            .build();

        assertThat(solution.solution(testCase.getMoney())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .money(15000)
            .expected(new int[]{2, 4000})
            .build();

        assertThat(solution.solution(testCase.getMoney())).isEqualTo(testCase.getExpected());
    }
}
