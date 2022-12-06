package programmers.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-06
 **/
class Solution_47Test {

    private final Solution_47 solution = new Solution_47();

    @Builder
    @Getter
    private static class TestCase {
        String numbers;
        long expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .numbers("onetwothreefourfivesixseveneightnine")
            .expected(123456789)
            .build();

        assertThat(solution.solution(testCase.getNumbers())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .numbers("onefourzerosixseven")
            .expected(14067)
            .build();

        assertThat(solution.solution(testCase.getNumbers())).isEqualTo(testCase.getExpected());
    }
}
