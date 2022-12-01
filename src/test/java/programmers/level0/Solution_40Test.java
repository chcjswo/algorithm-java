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
 * @since 2022-12-02
 **/
class Solution_40Test {

	private final Solution_40 solution = new Solution_40();

	@Builder
	@Getter
	private static class TestCase {
		String[] idpw;
		String[][] db;
		String expected;
	}

	@Test
	void test_1() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.idpw(new String[]{"meosseugi", "1234"})
				.db(new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}})
				.expected("login")
				.build();

		assertThat(solution.solution(testCase.getIdpw(), testCase.db)).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_2() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.idpw(new String[]{"programmer01", "15789"})
				.db(new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}, {"programmer011", "157891"}})
				.expected("wrong pw")
				.build();

		assertThat(solution.solution(testCase.getIdpw(), testCase.db)).isEqualTo(testCase.getExpected());
	}

	@Test
	void test_3() {
		TestCase testCase = new TestCase.TestCaseBuilder()
				.idpw(new String[]{"rabbit04", "98761"})
				.db(new String[][]{{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}})
				.expected("fail")
				.build();

		assertThat(solution.solution(testCase.getIdpw(), testCase.db)).isEqualTo(testCase.getExpected());
	}
}