package com.gecg;
import java.util.*;
import java.util.Queue;

public class QueueJavaCollection {
    public static void main(String[] args) {

        // here we have to write LinkedList for queue because queue is not a class it is an interface in java
//        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(45);
        queue.add(93);
        queue.add(18);
        queue.add(7);
        queue.add(6);
        queue.add(10);
        queue.add(33);

        System.out.println("Peek element is : " +queue.peek());

        while (!queue.isEmpty())
        {
            System.out.print(queue.peek() + " ");
            queue.remove();
        }
    }
}
