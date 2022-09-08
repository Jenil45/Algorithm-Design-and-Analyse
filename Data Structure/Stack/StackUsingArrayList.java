package com.gecg;

import java.util.*;
import java.util.ArrayList;

class StackAL
{
    ArrayList<Integer> list = new ArrayList<>();

    public boolean isEmpty()
    {
        if (list.size() == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void push(int data)
    {
        list.add(data);
    }

    public int pop()
    {
        if (isEmpty())
        {
            System.out.println("The stack is empty");
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    public int peek()
    {
        if (isEmpty())
        {
            return -1;
        }
        return list.get(list.size()-1);
    }
}

public class StackUsingArraylist {
    public static void main(String[] args) {
        StackAL s1 = new StackAL();

        s1.push(45);
        s1.push(93);
        s1.push(18);
        s1.push(7);
        s1.push(6);
        s1.push(1);
        s1.push(10);
        s1.pop();
        s1.pop();

        while (!s1.isEmpty())
        {
            System.out.print(s1.peek() + " ");
            s1.pop();
        }
    }
}
