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
