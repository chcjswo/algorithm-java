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
class Solution_19Test {

    private final Solution_19 solution = new Solution_19();

    @Builder
    @Getter
    private static class TestCase {
        String message;
        int expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .message("happy birthday!")
            .expected(30)
            .build();

        assertThat(solution.solution(testCase.getMessage())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .message("I love you~")
            .expected(22)
            .build();

        assertThat(solution.solution(testCase.getMessage())).isEqualTo(testCase.getExpected());
    }

}
