package com.gecg;

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
class QueueLinkedList
{
    Node head = null;
    Node tail = null;

    boolean isEmpty()
    {
        if (head==null && tail==null)
        {
//            System.out.println("Queue is empty");
            return true;
        }
        return false;
    }

    void add(int data)
    {
        Node newNode = new Node(data);
        if (tail == null)
        {
            tail=head=newNode;
            return;
        }
        tail.next = newNode;
        tail=newNode;
    }

    int remove()
    {
        if (isEmpty())
        {
            return -1;
        }
        int front = head.data;
        if (tail==head)
        {
            tail=null;
        }
        head=head.next;
        return front;
    }
    int peek()
    {
        if (isEmpty())
        {
            System.out.println("Empty queue");
            return -1;
        }
        return head.data;
    }


}

public class QueueLL {
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        queue.add(45);
        queue.add(93);
        queue.add(18);
        queue.add(7);
        queue.add(5);
        queue.add(6);
        queue.add(4);
        queue.remove();

        while (! queue.isEmpty())
        {
            System.out.print(queue.peek() + " ");
            queue.remove();
        }
    }
}
