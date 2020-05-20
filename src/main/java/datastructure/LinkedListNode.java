package datastructure;

class LinkedList {
    Node header;

    LinkedList() {
        header = new Node();
    }

    static class Node {
        int data;
        Node next;
    }

    void append(int d) {
        Node end = new Node();
        end.data = d;
        Node n = header;

        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    void delete(int d) {
        Node n = header;

        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }
    }

    void retrieve() {
        Node n = header.next;

        while (n.next != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println(n.data);
    }
}

public class LinkedListNode {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);
        ll.retrieve();
        ll.delete(3);
        ll.retrieve();
        ll.delete(2);
        ll.retrieve();
    }
}


