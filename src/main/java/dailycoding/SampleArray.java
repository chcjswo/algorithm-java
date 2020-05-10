package dailycoding;

/**
 * Created by chcjswo on 2020-05-10
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
public class SampleArray {
    private Node head;
    private Node tail;

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};

        SampleArray sampleArray = new SampleArray();
        sampleArray.makeArray(a1);
        System.out.println(sampleArray.toString());
    }

    public void makeArray(int[] arr) {
        for (int a : arr) {
            Node node = new Node();
            node.data = a;
            node.next = head;
            head = node;
        }
    }

    @Override
    public String toString() {
        String str = "[ ";
        for (Node n = head; n != null; n = n.next) {
            str += n.data;
            str += " ";
        }
        str += "]";
        return str;
    }
}

class Node {
    int data;
    Node next;
}


