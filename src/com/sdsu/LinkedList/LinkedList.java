package com.sdsu.LinkedList;

public class LinkedList {

  private  Node head;

    private static class Node {
        private int data;
        private Node next;


        public Node(int data) {
            this.data = data;
        }

    }

        public static void main(String[] args) {

            LinkedList linkedList = new LinkedList();
            linkedList.head = new Node(1);
            Node node1 = new Node(3);
            Node node2 = new Node(2);
            Node node3 = new Node(2);
            Node node4 = new Node(2);
            Node node5 = new Node(2);
            Node node6 = new Node(2);

            linkedList.head.next = node1;
            node1.next = node2;
            node2.next = node3;
            node3.next = node4;
            node4.next = node5;
            node5.next = node6;
           // node6.next = node3;

            Node middleNode = linkedList.findMiddle();
            System.out.println("Middle node is - " + middleNode.data);




            //newNode.next = linkedList.head;





          /*  if(linkedList.findNode(10)) {
                System.out.println("Search Key found !!!");
            } else {
                System.out.println("Search Key not found !!!");
            }
*/
           /* if(linkedList.findLoop()) {
                System.out.println("Loop found !!!");
            } else {
                System.out.println(" loop not found !!!");
            }*/




         /*   boolean isPresent = false;
            if (isPresent = true)
            {
                isPresent = linkedList.findNode(10);
                System.out.println("value found "+isPresent);
            }
           else
            {
                System.out.println("Not present");
            }*/
          /*  linkedList.insertLast(11);
            linkedList.insertLast(8);
            linkedList.insertLast(1);*/


           // linkedList.display();  //print linkedlist
            //linkedList.length();
            //linkedList.insertFirst(); // insert node first*/
        }


        public   void display() {
            Node current =  head;
            while(current != null)
            {
                System.out.print(current.data + " --> ");
                current = current.next;
            }
            System.out.println("null");

        }

    public   void length() {
        Node current =  head;
        int count =0;
        while(current != null) {
            current = current.next;
            count++;
        }
        System.out.println(count);

    }



    public   void insertFirst() {
         Node firstNode = new Node(0);
         head = new Node(1);
         Node node2 = new Node(2);
         Node node3 = new Node(3);
         Node node4 = new Node(4);
         firstNode.next = head;
        head.next = node2;
        node2.next = node3;
        node3.next = node4;

        while(firstNode != null) {
            System.out.print(firstNode.data + " --> ");
            firstNode = firstNode.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public   void insertLast(int value) {
        Node lastNode = new Node(value);
        if (head == null) {
            head = lastNode;
            return;
        }

        Node current =  head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = lastNode;

    }


    public   boolean findNode(int value) {

        if (head == null) {
            return false;
        }

        Node current =  head;
        while (current.next != null) {
            if(current.data == value)
            {
                return true;
            }
            current = current.next;
        }

        return false;
    }


    public   boolean findLoop() {

        if (head == null) {
            return false;
        }

        Node fastPointer = head;
        Node slowPointer = head;

        while (fastPointer.next != null && slowPointer.next != null)
        {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer)
            {
               return  true;
            }

        }

        return false;
    }



    public   Node findMiddle() {

            if(head == null) {
                return null;
            }

        Node fastPointer = head;
        Node slowPointer = head;

        while (fastPointer.next != null && slowPointer.next != null)
        {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
           // if (slowPointer == fastPointer)
           // {
                System.out.println(slowPointer.data);
                return  slowPointer;
            //}

        }

        return null;
    }


}
