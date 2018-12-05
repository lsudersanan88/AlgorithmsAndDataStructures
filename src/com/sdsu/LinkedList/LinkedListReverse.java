package com.sdsu.LinkedList;

public class LinkedListReverse {

    private Node1 head;
    private static class Node1{

      int data;
      Node1 next;

        public Node1(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {

        LinkedListReverse sll = new LinkedListReverse();
        sll.head = new Node1(10);
        Node1 second = new Node1(1);
        Node1 third = new Node1(8);
        Node1 fourth = new Node1(11);

        // Now we will connect them together to form a chain
        sll.head.next = second; // 10 --> 1
        second.next = third; // 10 --> 1 --> 8
        third.next = fourth; // 10 --> 1 --> 8 --> 11 --> null

        sll.display();

        Node1 newHead = sll.reverse();
        sll.head = newHead;
        sll.display();

    }

    private int length()
    {
        int count = 0;
       Node1 current = head;
       while(current!= null)
       {
          current = current.next;
          count++;
       }
       return count;
    }
    private Node1 reverse ()
    {

        Node1 current = head;
        Node1 previous = null;
        Node1 next = null;
        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;

    }
    public   void display() {
        Node1 current =  head;
        while(current != null)
        {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");

    }
}
