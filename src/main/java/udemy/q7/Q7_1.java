package udemy.q7;

/**
 * Created by chcjswo on 2020-04-26
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
public class Q7_1 {
    private Node head;

    public static void main(String[] args) {
        Q7_1 q7_1 = new Q7_1();
        q7_1.addToHead(1);
        q7_1.addToHead(2);
        q7_1.addToHead(3);
        System.out.println(q7_1.toString());

        q7_1.removeFirst();
        System.out.println(q7_1.toString());
        q7_1.removeFirst();
        System.out.println(q7_1.toString());
        q7_1.removeFirst();
        System.out.println(q7_1.toString());
        q7_1.removeFirst();
        System.out.println(q7_1.toString());
    }

    public void addToHead(int n) {
        Node node = new Node();
        node.data = n;
        node.next = head;
        head = node;
        System.out.println("head: " + head.next);
    }

    public void removeFirst() {
        if (head == null) {
            throw new RuntimeException("no data");
        }

        head = head.next;
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
