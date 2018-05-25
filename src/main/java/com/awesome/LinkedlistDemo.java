package com.awesome;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Anurag Mishra on 25-05-2018.
 */
public class LinkedlistDemo {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("kanchna");
        linkedList.add("richa");
        linkedList.add("rani");
        linkedList.add("neha");
        linkedList.add("ankita");
        linkedList.add("ruchika");
        linkedList.add("priyanka");

        System.out.println("LinkeList is asa follows:");
        System.out.println(linkedList);
//        for(String string : linkedList){
//            System.out.println(string);
//        }
        linkedList.add(3,"Siya");
        System.out.println("Linkedlist after insertion: ");
        System.out.println(linkedList);
//        for(String string : linkedList){
//            System.out.println(string);
//        }
        linkedList.remove(5);
        System.out.println(linkedList);
    }
}
