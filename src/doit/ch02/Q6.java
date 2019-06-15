package doit.ch02;

/**
 * The type Q 6.
 */
public class Q6 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[6];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = i + 1;
        }

        print(arr);
        System.out.println();

        for (int i = 0; i < arr.length / 2; i++) {
            System.out.println(i);
            swap(arr, i, arr.length - i - 1);
        }

        print(arr);
    }

    private static void print(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }


    private static void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
