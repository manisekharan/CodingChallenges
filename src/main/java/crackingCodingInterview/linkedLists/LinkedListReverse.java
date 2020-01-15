package crackingCodingInterview.linkedLists;

import crackingCodingInterview.linkedLists.MyLinkedList.*;

public class LinkedListReverse {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.head = new Node(1);
        myLinkedList.head.next = new Node(2);
        myLinkedList.head.next.next = new Node(3);

        printLinkedList(myLinkedList);
        reverseLinkedList(myLinkedList);
        printLinkedList(myLinkedList);

        myLinkedList.head = recursiveReverse(myLinkedList.head);
        printLinkedList(myLinkedList);

    }

    public static void printLinkedList(MyLinkedList linkedList) {
        Node h = linkedList.head;
        while (linkedList.head != null) {
            System.out.print(linkedList.head.data + " ");
            linkedList.head = linkedList.head.next;
        }
        System.out.println();
        linkedList.head = h;
    }

    public static void reverseLinkedList(MyLinkedList linkedList) {
        Node previous = null;
        Node current = linkedList.head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        linkedList.head = previous;
    }

    public static Node recursiveReverse(Node head) {
        Node first;

        if (head==null || head.next == null)
            return head;

        first = recursiveReverse(head.next);
        head.next.next = head;
        head.next = null;

        return first;
    }

}
/*

Time Complexity – O(n)
Space Complexity – O(1)

Loop the following till current is NOT null:

Save the next Node of the current element in the next pointer.
Set the next of the current Node to the previous. This is the MVP line.
Shift previous to current.
Shift the current element to next.
In the end, since the current has gone one place ahead of the last element, we need to set the head to the last element we reached. This is available in previous.
Set head to previous. Thus we have our new head of the LinkedList which is the last element of the older LinkedList.

 */
