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
 * @since 2022-11-25
 **/
class Solution_30Test {

    private final Solution_30 solution = new Solution_30();

    @Builder
    @Getter
    private static class TestCase {
        String my_string;
        int num1;
        int num2;
        String expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .my_string("hello")
            .num1(1)
            .num2(2)
            .expected("hlelo")
            .build();

        assertThat(solution.solution(testCase.getMy_string(), testCase.getNum1(), testCase.getNum2())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .my_string("I love you")
            .num1(3)
            .num2(6)
            .expected("I l veoyou")
            .build();

        assertThat(solution.solution(testCase.getMy_string(), testCase.getNum1(), testCase.getNum2())).isEqualTo(testCase.getExpected());
    }
}
