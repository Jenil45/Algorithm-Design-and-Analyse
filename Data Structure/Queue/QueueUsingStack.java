package com.gecg;
import java.util.*;
/*
    for queue using stack we want 2 stack
    Algorithm :
    first element put in stack 1
    then second arrive do , first pop and put into stack 2 and enter another into stack1 now again stack2 element put into stack2
    same for next comes ,
 */


public class QueueUsingStack {
    static class Queue
    {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty()
        {
            return s1.isEmpty();
        }
        public static void add(int data)
        {
            while (! s1.isEmpty())
            {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (! s2.isEmpty())
            {
                s1.push(s2.pop());
            }
        }

        public static int remove()
        {
            if (isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }

        public static int peek()
        {
            if (isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        Queue.add(45);
        Queue.add(93);
        Queue.add(18);
        Queue.add(7);
        Queue.add(33);
        Queue.add(5);

        while (!Queue.isEmpty())
        {
            System.out.println(Queue.peek());
            Queue.remove();
        }
    }
}
