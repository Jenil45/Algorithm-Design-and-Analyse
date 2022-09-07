package com.gecg;
import java.util.*;

public class LL_collection_framework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        System.out.println(list);
        list.addLast("linked");
        list.addLast("list");
        System.out.println(list);
        System.out.println(list.size());

        // list traverse
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("NULL");

        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
