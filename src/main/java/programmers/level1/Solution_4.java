package programmers.level1;

/**
 * 문자열 내 p와 y의 개수
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-12
 **/
public class Solution_4 {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        for (String s1 : s.toLowerCase().split("")) {
            if (s1.equals("p")) {
                pCount++;
            }
            if (s1.equals("y")) {
                yCount++;
            }
        }
        return pCount == yCount;
    }
}
