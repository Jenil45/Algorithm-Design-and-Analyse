package com.gecg;

public class LL {
public Node head = null;
private int size;
    LL()
    {
        this.size=0;
    }
    class Node
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        LL list = new LL();



        list.addLast("5");
        list.addLast("4");
        list.addLast("3");
        list.addLast("2");
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        list.addCycle(4 , "10" , list.head);
        System.out.println(list.size);
        list.printLL();
        System.out.println(list.size);
//        list.iterateReverse();
//        list.printLL();
//        list.head = list.recursivereverse(list.head);
//        list.printLL();

//        System.out.println(list.lastNthNodeDelete(list.head  , 6));
        System.out.println(list.palindrome(list.head));
    }
}
