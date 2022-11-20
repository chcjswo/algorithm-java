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
class Solution_15Test {

    @Builder
    @Getter
    private static class TestCase {
        String s;
        int n;
        String expected;
    }

    private final Solution_15 solution = new Solution_15();

    @Test
    void solution() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .s("hello")
            .n(3)
            .expected("hhheeellllllooo")
            .build();

        assertThat(solution.solution(testCase.getS(), testCase.getN())).isEqualTo(testCase.getExpected());
    }
}
