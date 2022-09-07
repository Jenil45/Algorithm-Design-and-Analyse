package com.gecg;

class Node1
{
    int data;
    Node1 next;

    Node1(int data)
    {
        this.data = data;
        next = null;
    }
}

class StackLL
{
    public Node1 head;
    public boolean isEmpty()
    {
        if (head==null)
        {
            return true;
        }
        return false;
    }

    public void push(int data)
    {
        Node1 newNode = new Node1(data);
        if (isEmpty())
        {
            head=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public int pop()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            return  -1;
        }
        int pop = head.data;
        head = head.next;
        return pop;
    }

    public int peek()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            return  -1;
        }
        return head.data;
    }
}

public class StackUsiingLL {
    public static void main(String[] args) {
        StackLL s1 = new StackLL();
        s1.push(45);
        s1.push(93);
        s1.push(18);
        s1.push(33);

        while (!s1.isEmpty())
        {
            System.out.print(s1.peek() + " ");
            s1.pop();
        }
    }
}
