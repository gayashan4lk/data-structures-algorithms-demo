package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Node start = new Node(23);
        start.next = new Node(3356);
        start.next.next = new Node(999);
        start.next.next.next = new Node(33);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String startJson = gson.toJson(start);
//        System.out.println(startJson);

        LinkedList myList = new LinkedList();
        myList.insert(11);
        myList.insert(22);
        myList.insert(33);
        myList.insert(44);
        myList.insert(55);

        myList.delete(55);

        String myListJson = gson.toJson(myList);
        System.out.println(myListJson);

//        myList.transverse();
    }
}

