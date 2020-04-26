package udemy.q4;

import java.util.HashMap;

/**
 * Created by chcjswo on 2020-04-26
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
public class Q4_5 {
    private HashMap<String, Integer> map;

    public static void main(String[] args) {
        String word = "aaa bbb ccc aaa ddd";
        Q4_5 q4_5 = new Q4_5();
        q4_5.read(word.split(" "));
    }

    public Q4_5(){
        map = new HashMap<>();
    }

    public void read(String[] doc) {
        for (String str : doc) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
    }

    public int getCount(String word) {
        if (!map.containsKey(word)) {
            return 0;
        }
        return map.get(word);
    }
}
