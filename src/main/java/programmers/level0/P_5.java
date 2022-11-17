package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 짝수는 싫어요
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-11-17
 **/
public class P_5 {

    public static void main(String[] args) {
        int n = 15;
        int[] solution = solution(n);
        Arrays.stream(solution).forEach(s -> System.out.println("s = " + s));
    }

    private static int[] solution(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                result.add(i);
            }
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
//        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}
