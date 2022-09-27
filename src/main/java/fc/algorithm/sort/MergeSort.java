package fc.algorithm.sort;

import java.util.Arrays;

/**
 * 병합 정렬
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-16
 **/
public class MergeSort {

    public static void main(String[] args) {

        int[] numbers = {3, 4, 1, 9, 5, 10, 6};
        Arrays.stream(numbers).forEach(System.out::println);
        System.out.println("==============================================");
        split(numbers);
    }

    private static void split(int[] numbers) {
        if (numbers.length <= 1) {
            return;
        }
        int mid = numbers.length / 2;
        int[] left = new int[3];
        int[] right = new int[numbers.length - mid];
        System.arraycopy(numbers, 0, left, 0, left.length);
        System.arraycopy(numbers, mid, right, 0, right.length);
        Arrays.stream(left).forEach(System.out::println);
        System.out.println("==============================================");
        Arrays.stream(right).forEach(System.out::println);
    }
}
