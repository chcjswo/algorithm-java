package udemy.q4;

import java.util.HashMap;

/**
 * Created by chcjswo on 2020-04-25
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
public class Q4_3 {
    public static void main(String[] args) {
        Q4_3 q4_3 = new Q4_3();
        System.out.println(q4_3.isAnagram("abc", "bca"));
        System.out.println(q4_3.isAnagram("abc", "bcd"));
    }

    public boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

//        HashMap<Character, Character> a = new HashMap<>();
//
//        for (char c : s1.toCharArray()) {
//            a.put(c, c);
//        }
//
//        for (char c : s2.toCharArray()) {
//            if (!a.containsKey(c)) {
//                return false;
//            }
//        }

        HashMap<Character, Integer> a = new HashMap<>();

        for (char c : s1.toCharArray()) {
            if (a.containsKey(c)) {
                a.put(c, a.get(c) + 1);
            } else {
                a.put(c, 1);
            }
        }

        for (char c : s2.toCharArray()) {
            if (!a.containsKey(c)) {
                return false;
            }
            if (a.get(c) == 0) {
                return false;
            }

            a.put(c, a.get(c) - 1);
        }

        return true;
    }
}
