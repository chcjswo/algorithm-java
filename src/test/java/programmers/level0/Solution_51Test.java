package programmers.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-09
 **/
class Solution_51Test {

    private final Solution_51 solution = new Solution_51();

    @Builder
    @Getter
    private static class TestCase {
        String[] spell;
        String[] dic;
        int expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .spell(new String[]{"p", "o", "s"})
            .dic(new String[]{"sod", "eocd", "qixm", "adio", "soo"})
            .expected(2)
            .build();

        assertThat(solution.solution(testCase.getSpell(), testCase.getDic())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .spell(new String[]{"z", "d", "x"})
            .dic(new String[]{"def", "dww", "dzx", "loveaw"})
            .expected(1)
            .build();

        assertThat(solution.solution(testCase.getSpell(), testCase.getDic())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_3() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .spell(new String[]{"s", "o", "m", "d"})
            .dic(new String[]{"moos", "dzx", "smm", "sunmmo", "som"})
            .expected(2)
            .build();

        assertThat(solution.solution(testCase.getSpell(), testCase.getDic())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_4() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .spell(new String[]{"s", "o", "o", "d"})
            .dic(new String[]{"doos", "dzx", "smm", "sunmmo", "som"})
            .expected(1)
            .build();

        assertThat(solution.solution(testCase.getSpell(), testCase.getDic())).isEqualTo(testCase.getExpected());
    }
}
