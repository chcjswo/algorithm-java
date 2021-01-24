package hellocoding.ch_1;

/**
 * @author chcjswo
 * @version 1.0.0
 * @Blog http://mocadev.tistory.com
 * @Github http://github.com/chcjswo
 * @since 2021-01-17
 **/
public class Ch_02 {

    public static void main(String[] args) {
        Ch_02 a = new Ch_02();
        int[] arr = {8, 5, 6, 3, 1, 2, 9};
        a.selectionSort(arr);
        for (int i : arr) {
            System.out.println("i = " + i);
        }
    }

    public void selectionSort(int[] arr) {
        int min;
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

}
