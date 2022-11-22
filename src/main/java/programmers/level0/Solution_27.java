package programmers.level0;

import java.util.HashMap;
import java.util.Map;

/**
 * 코딩테스트 연습 > 코딩테스트 입문 > 모스부호 (1)
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-11-22
 **/
public class Solution_27 {
    public String solution(String letter) {
        Map<String, String> map = new HashMap<>();
        map.put(".-", "a");
        map.put("-...", "b");
        map.put("-.-.", "c");
        map.put("-..", "d");
        map.put(".", "e");
        map.put("..-.", "f");
        map.put("--.", "g");
        map.put("....", "h");
        map.put("..", "i");
        map.put(".---", "j");
        map.put("-.-", "k");
        map.put(".-..", "l");
        map.put("--", "m");
        map.put("-.", "n");
        map.put("---", "o");
        map.put(".--.", "p");
        map.put("--.-", "q");
        map.put(".-.", "r");
        map.put("...", "s");
        map.put("-", "t");
        map.put("..-", "u");
        map.put("...-", "v");
        map.put(".--", "w");
        map.put("-..-", "x");
        map.put("-.--", "y");
        map.put("--..", "z");

        String[] s = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String item : s) {
            sb.append(map.get(item));
        }
        return sb.toString();
    }
}
