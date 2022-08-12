package fc.algorithm.sort;

import java.util.Arrays;

/**
 * 선택 정렬
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-13
 **/
public class SelectionSort {

    public static void main(String[] args) {
        int[] numbers = {3, 4, 1, 9, 5, 10, 6};
        Arrays.stream(numbers).forEach(System.out::println);
        for (int i = 0; i < numbers.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[index] > numbers[j]) {
                    index = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[index];
            numbers[index] = temp;
        }
        System.out.println("==============================================");
        Arrays.stream(numbers).forEach(System.out::println);
    }
}
