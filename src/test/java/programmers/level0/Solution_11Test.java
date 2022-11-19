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
 * @since 2022-11-19
 **/
class Solution_11Test {

    @Builder
    @Getter
    private static class TestCase {
        int age;
        int expected;
    }

    private final Solution_11 solution = new Solution_11();

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .age(40)
            .expected(1983)
            .build();

        assertThat(solution.solution(testCase.getAge())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .age(23)
            .expected(2000)
            .build();

        assertThat(solution.solution(testCase.getAge())).isEqualTo(testCase.getExpected());
    }

}
