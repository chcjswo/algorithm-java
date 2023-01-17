package programmers.level2;

/**
 * 스킬트리
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-18
 **/
public class Solution_7 {
	public int solution(String skill, String[] skill_trees) {
		int answer = 0;
		for (String skillTree : skill_trees) {
			final String s = skillTree.replaceAll("[^" + skill + "]", "");
			if (skill.startsWith(s)) {
				answer++;
			}
		}
		return answer;
	}
}
