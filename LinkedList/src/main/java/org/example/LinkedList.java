package org.example;

public class LinkedList{
    Node head;

    public void insert(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
        } else {
            var current = head;

            while (current.next != null){
                current = current.next;
            }

            current.next = newNode;
        }
    }

    public void delete(int data){
        Node current = head;

        if (current != null){
            while (current.next != null){
                if (current.next.data == data){
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
        }
    }

    public void transverse(){
        var current = head;

        do {
            System.out.println(current.data);
            current = current.next;
        } while (current.data != 0);
    }
}
