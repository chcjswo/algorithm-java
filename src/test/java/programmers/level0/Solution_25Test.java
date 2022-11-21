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
class Solution_25Test {

    private final Solution_25 solution = new Solution_25();

    @Builder
    @Getter
    private static class TestCase {
        String[] strlist;
        int[] expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .strlist(new String[]{"We", "are", "the", "world!"})
            .expected(new int[]{2, 3, 3, 6})
            .build();

        assertThat(solution.solution(testCase.getStrlist())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .strlist(new String[]{"I", "Love", "Programmers."})
            .expected(new int[]{1, 4, 12})
            .build();

        assertThat(solution.solution(testCase.getStrlist())).isEqualTo(testCase.getExpected());
    }
}
