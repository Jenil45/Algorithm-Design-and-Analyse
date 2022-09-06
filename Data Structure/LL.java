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
    // add first
    public void addFirst(String data)
    {
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
            head.next = null;
            size++;
            return;
        }
        size++;
        newNode.next = head;
        head = newNode;
    }

    // add last
    public void addLast(String data)
    {
        Node newNode = new Node(data);
        Node ptr = head;
        if (head == null)
        {
            head = newNode;
            head.next = null;
            size++;
            return;
        }
        while (ptr.next != null)
        {
            ptr = ptr.next;
        }
        size++;
        ptr.next = newNode;
        newNode.next = null;
    }
    
    // print linkedlist
    public void printLL()
    {
        if (head == null)
        {
            System.out.println("list is empty");
        }
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + "->");
            ptr=ptr.next;
        }
        System.out.println("NULL");
    }
    
    // delete first
    public void deleteFirst()
    {
        if (head == null)
        {
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }

    // delete last
    public void deleteLast()
    {
        if (head == null)
        {
            System.out.println("List is mepty");
            return;
        }
        Node ptr = head;
        Node ptr1 = head.next;
        while (ptr1.next != null)
        {
            ptr = ptr.next;
            ptr1 = ptr1.next;
        }
        size--;
        ptr.next = null;

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
