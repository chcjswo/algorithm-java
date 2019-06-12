package resolution.sort;

import java.util.Scanner;

/**
 * 선택 정렬
 * Created by chcjswo on 2019-06-12
 * Blog: http://mocadev.tistory.com
 * Github: http://github.com/chcjswo
 */
public class Selection {
    public static void main(String[] args) {
        int[] data = {1, 10, 14, 4, 6, 7, 3, 11, 5, 23, 22, 224, 356};

        int len = data.length;
        int min;
        int temp;

        for (int i = 0; i < len -1; i++) {
            min = i;

            for (int j = i + 1; j < len; j++) {
                if (data[min] > data[j]) {
                    min = j;
                }
            }

            temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }

        for (int item : data) {
            System.out.print(item + " ");
        }
    }
}
