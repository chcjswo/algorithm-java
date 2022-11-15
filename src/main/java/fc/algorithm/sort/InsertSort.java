package fc.algorithm.sort;

import java.util.Arrays;

/**
 * 삽입 정렬
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-15
 **/
public class InsertSort {

    public static void main(String[] args) {
        int limit = 10;
        int[] numbers = new int[limit];
        for (int i = 0; i < limit; i++) {
            numbers[i] = ((int) (Math.random() * limit) + 1);
        }
        Arrays.stream(numbers).forEach(System.out::println);
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (numbers[j - 1] > numbers[j]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                }
            }
        }
        System.out.println("==============================================");
        Arrays.stream(numbers).forEach(System.out::println);
    }
}
