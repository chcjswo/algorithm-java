package resolution.sort;

/**
 * 삽입 정렬
 * Created by chcjswo on 2019-06-12
 * Blog: http://mocadev.tistory.com
 * Github: http://github.com/chcjswo
 */
public class Insertion {
    public static void main(String[] args) {

        int[] data = {10, 1, 14, 4, 6, 7, 3, 11, 5, 23, 22, 224, 356};

        int len = data.length;
        int temp;
        int j;

        for (int i = 1; i < len; i++) {
            temp = data[i];

            for (j = i - 1; j >= 0 && data[j] > temp; j--) {
                data[j + 1] = data[j];
            }
            data[j + 1] = temp;
        }

        for (int item : data) {
            System.out.print(item + " ");
        }
    }
}
