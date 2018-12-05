package com.sdsu.LinkedList;

import javax.sound.midi.Soundbank;

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
           /* linkedList.head = new Node(1);
            Node newNode = new Node(0);
            Node node3 = new Node(3);
            Node node2 = new Node(2);

            newNode.next = linkedList.head;
            linkedList.head.next = node2;
            node2.next = node3;*/
            linkedList.insertLast(11);
            linkedList.insertLast(8);
            linkedList.insertLast(1);


            linkedList.display();  //print linkedlist
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




    }
