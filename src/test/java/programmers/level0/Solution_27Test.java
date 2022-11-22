package programmers.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-11-22
 **/
class Solution_27Test {

    private final Solution_27 solution = new Solution_27();

    @Builder
    @Getter
    private static class TestCase {
        String letter;
        String expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .letter(".... . .-.. .-.. ---")
            .expected("hello")
            .build();

        assertThat(solution.solution(testCase.getLetter())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .letter(".--. -.-- - .... --- -.")
            .expected("python")
            .build();

        assertThat(solution.solution(testCase.getLetter())).isEqualTo(testCase.getExpected());
    }

}
