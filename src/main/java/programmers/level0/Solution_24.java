package programmers.level0;

import java.util.Arrays;

/**
 * 코딩테스트 연습 > 코딩테스트 입문 > 삼각형의 완성조건 (1)
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-11-21
 **/
public class Solution_24 {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[2] < sides[1] + sides[0] ? 1 : 2;
    }
}
