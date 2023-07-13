package org.data.linkedlist;

class LinkedList {
    static Node head;



    static class Node{
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }


}


public class ReverseLinkedList extends  LinkedList{

    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args)
    {
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }

    private Node reverse(Node head) {
        if(head == null)
            return null;
        Node prev = null;
        while (head!=null){
            Node headNode = head.next;
            head.next = prev;
            prev = head;
            head = headNode;
        }
        return prev;
    }

}


