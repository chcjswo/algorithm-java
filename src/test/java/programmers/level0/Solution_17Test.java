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
class Solution_17Test {

    private final Solution_17 solution = new Solution_17();

    @Builder
    @Getter
    private static class TestCase {
        int n;
        int k;
        int expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .n(10)
            .k(3)
            .expected(124000)
            .build();

        assertThat(solution.solution(testCase.getN(), testCase.getK())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .n(64)
            .k(6)
            .expected(768000)
            .build();

        assertThat(solution.solution(testCase.getN(), testCase.getK())).isEqualTo(testCase.getExpected());
    }
}
