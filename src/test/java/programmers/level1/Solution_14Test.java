package programmers.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author mcjeon
 * @version 1.0.0
 * @since 2023-01-04
 **/
class Solution_14Test {

    private final Solution_14 solution = new Solution_14();

    @Builder
    @Getter
    private static class TestCase {
        String[] participant;
        String[] completion;
        String expected;
    }

    @Test
    void test_1() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .participant(new String[]{"leo", "kiki", "eden"})
            .completion(new String[]{"eden", "kiki"})
            .expected("leo")
            .build();

        assertThat(solution.solution(testCase.getParticipant(), testCase.getCompletion())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_2() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .participant(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"})
            .completion(new String[]{"josipa", "filipa", "marina", "nikola"})
            .expected("vinko")
            .build();

        assertThat(solution.solution(testCase.getParticipant(), testCase.getCompletion())).isEqualTo(testCase.getExpected());
    }

    @Test
    void test_3() {
        TestCase testCase = new TestCase.TestCaseBuilder()
            .participant(new String[]{"mislav", "stanko", "mislav", "ana"})
            .completion(new String[]{"stanko", "ana", "mislav"})
            .expected("mislav")
            .build();

        assertThat(solution.solution(testCase.getParticipant(), testCase.getCompletion())).isEqualTo(testCase.getExpected());
    }
}
