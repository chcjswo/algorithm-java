package udemy.q4;

import java.util.HashMap;

/**
 * udemy 4-4 문제
 * Created by chcjswo on 2019-06-17
 * Blog: http://mocadev.tistory.com
 * Github: http://github.com/chcjswo
 */
public class Q4_4 {
    public static void main(String[] args) {
        Q4_4 q4_4 = new Q4_4();

        System.out.println(q4_4.coding("aabbbbcccdff"));
        System.out.println(q4_4.coding2("aabb"));
    }

    public String coding(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }

        StringBuffer sb = new StringBuffer();

        for (Character c : hashMap.keySet()) {
            sb.append(c.toString()).append(hashMap.get(c));
        }

        return sb.toString();
    }

    public String coding2(String s) {
        char[] ca = s.toCharArray();
        String result = "";
        char prev = ca[0];
        int count = 1;

        for (int i = 1, len = ca.length; i < len; i++) {
            if (prev == ca[i]) {
                count++;
            } else {
                result = result + prev + count;
                prev = ca[i];
                count = 1;
            }
        }
        result = result + prev + count;

        return result;
    }
}
