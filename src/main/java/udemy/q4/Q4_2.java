package udemy.q4;

import java.util.HashSet;

/**
 * Created by chcjswo on 2020-04-24
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
public class Q4_2 {
    public static void main(String[] args) {
        Q4_2 q4_2 = new Q4_2();
        System.out.println(q4_2.isUniqChar("abcde"));
    }

    public boolean isUniqChar(String s) {
        HashSet<Object> hashSet = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (hashSet.contains(c)) {
                return false;
            }
            hashSet.add(c);
        }

        return true;
    }
}
