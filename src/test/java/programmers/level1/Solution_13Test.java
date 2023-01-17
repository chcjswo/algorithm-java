package programmers.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-16
 **/
class Solution_13Test {

    private final Solution_13 solution = new Solution_13();

    @Builder
    @Getter
    private static class TestCase {
        String s;
        String expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .s("try hello world")
            .expected("TrY HeLlO WoRlD")
            .build();

        assertThat(solution.solution(testCase.getS())).isEqualTo(testCase.getExpected());
    }
}
