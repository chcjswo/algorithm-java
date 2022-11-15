package coding;

/**
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-11-14
 **/
public class Solution1 {
    public static void main(String[] args) {
//        int[] blocks = {2, 6, 8, 5};
//        int[] blocks = {1, 5, 5, 2, 6};
        int[] blocks = {1, 1};

        Solution1 solution = new Solution1();
        int solution1 = solution.solution(blocks);
        System.out.println("solution1 = " + solution1);
    }

    public int solution(int[] blocks) {
        int count = blocks.length;
        for (int i = 0; i < blocks.length - 1; i++) {
            if (blocks[i] > blocks[i + 1]) {
                count--;
            }
        }
        return count;
    }
}
