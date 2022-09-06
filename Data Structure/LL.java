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
    
        // Reverse linked list
    public void iterateReverse()
    {
        if (head == null || head.next==null)
        {
            return;
        }
        Node prev = head;
        Node currNode = head.next;
        while (currNode != null)
        {
            Node nextNode = currNode.next;
            currNode.next = prev;

            // update
            prev = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head=prev;
    }

    public Node recursivereverse(Node head)
    {
        if (head == null || head.next==null)
        {
            System.out.println("list is empty");
            return head;
        }
        Node newhead = recursivereverse(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
    
        public String lastNthNodeDelete(Node head , int n)
    {
        if (head.next == null)
        {
            return null;
        }
        Node first = head;
        int size=0;
        while (first != null)
        {
            first=first.next;
            size++;
        }

        int i=1;
        Node second = head;
        while (i != (size-n))
        {
            second = second.next;
            i++;
        }
        String val = second.next.data;
        second.next = second.next.next;

        return val;
    }
    // palindrome linked list or not

    public Node findMiddle(Node head)
    {
        Node hare = head;
        Node turtle = head;

        while (hare.next != null && hare.next.next != null)
        {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
    public boolean palindrome(Node head)
    {
        if (head == null || head.next==null)
        {
            return true;
        }

        Node middle = findMiddle(head);
        Node secondLLStart = recursivereverse(middle.next);
        Node firstLLStart = head;
        while (secondLLStart != null)
        {
            if (firstLLStart.data != secondLLStart.data)
            {
                return false;
            }
            firstLLStart = firstLLStart.next;
            secondLLStart = secondLLStart.next;

        }
        return true;

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
