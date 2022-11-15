package fc.algorithm.sort;

import java.util.Arrays;

/**
 * 버블 정렬
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-11
 **/
public class BubbleSort {

    public static void main(String[] args) {
        int limit = 10;
        int[] numbers = new int[limit];
        for (int i = 0; i < limit; i++) {
            numbers[i] = ((int) (Math.random() * limit) + 1);
        }

        Arrays.stream(numbers).forEach(System.out::println);

        for (int index1 = 0; index1 < numbers.length - 1; index1++) {
            boolean isSwap = false;

            for (int j = 0; j < numbers.length - 1 - index1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    isSwap = true;
                }
            }

            if (!isSwap) {
                break;
            }
        }
        System.out.println("==============================================");
        Arrays.stream(numbers).forEach(System.out::println);
    }
}
