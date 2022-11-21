package programmers.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-11-21
 **/
class Solution_22Test {

    private final Solution_22 solution = new Solution_22();

    @Builder
    @Getter
    private static class TestCase {
        int age;
        String expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .age(23)
            .expected("cd")
            .build();

        assertThat(solution.solution(testCase.getAge())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .age(51)
            .expected("fb")
            .build();

        assertThat(solution.solution(testCase.getAge())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_3() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .age(100)
            .expected("baa")
            .build();

        assertThat(solution.solution(testCase.getAge())).isEqualTo(testCase.getExpected());
    }
}
