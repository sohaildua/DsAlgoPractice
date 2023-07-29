package org.data;

class ListNode {
    int data;
    ListNode next;

    ListNode(int d) {
        data = d;
        next = null;
    }
}

public class MergeSinglyLinkedList {
   static ListNode head;

    public void insertAtLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        ListNode current = head;
        int count = 0;
        while (current != null) {
            System.out.print(current.data + "-->");
            count++;
            current = current.next;
        }
        System.out.println("null");
    }

    public void display1() {
        ListNode current = head;
        int count = 0;
        while (current != null) {
            System.out.print(current.data + "-->");
            count++;
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MergeSinglyLinkedList sll1 = new MergeSinglyLinkedList();
        sll1.insertAtLast(1);
        sll1.insertAtLast(5);
        sll1.insertAtLast(9);
        sll1.insertAtLast(11);

        MergeSinglyLinkedList sll2 = new MergeSinglyLinkedList();
        sll2.insertAtLast(2);
        sll2.insertAtLast(3);
        sll2.insertAtLast(7);
        sll2.insertAtLast(10);
        sll2.insertAtLast(11);
        sll2.insertAtLast(13);
        sll2.insertAtLast(19);
        sll2.insertAtLast(20);

        sll1.display();
        sll2.display1();
    }
}
