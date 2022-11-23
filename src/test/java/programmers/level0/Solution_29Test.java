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
 * @since 2022-11-23
 **/
class Solution_29Test {

    private final Solution_29 solution = new Solution_29();

    @Builder
    @Getter
    private static class TestCase {
        int hp;
        int expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .hp(23)
            .expected(5)
            .build();

        assertThat(solution.solution(testCase.getHp())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .hp(24)
            .expected(6)
            .build();

        assertThat(solution.solution(testCase.getHp())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_3() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .hp(999)
            .expected(201)
            .build();

        assertThat(solution.solution(testCase.getHp())).isEqualTo(testCase.getExpected());
    }
}
