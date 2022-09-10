package com.gecg;

class CircularrQueue
{
    int front , rear , size;
    int capacity;
    int array[];

    CircularrQueue(int capacity)
    {
        this.capacity = capacity;
        size = capacity;
        rear = -1;
        front = -1;
        this.array = new int[this.capacity];
    }

    boolean isEmpty()
    {
        if (rear == -1 && front == -1)
        {
            return true;
        }
        return false;
    }

    boolean isFull()
    {
        if ((rear+1)%this.capacity == front)
        {
            return true;
        }
        return false;
    }

    void enqueue(int data)
    {
        if (isFull())
        {
            System.out.println("Queue is full");
            return;
        }
        if (front==-1)
        {
            front=0;
        }
        this.rear = (this.rear + 1)%this.size;
        this.array[this.rear] = data;
//        this.size = this.size+1;
    }

    int dequeue()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty.");
            return -1;
        }
        int dequeued = this.array[front];
        if (rear == front)
        {
            rear = front = -1;
        }
        front = (front+1)%this.size;
        return dequeued;
    }

    void printQueue()
    {
        while (!isEmpty())
        {
            System.out.print(this.peek() + " ");
            dequeue();
        }
    }
    int peek()
    {
        if (isEmpty())
        {
            return -1;
        }
        return this.array[front];
    }
}

public class CircularQueuePractise {
    public static void main(String[] args) {
        CircularrQueue circleQueue = new CircularrQueue(7);
        circleQueue.enqueue(45);
        circleQueue.enqueue(93);
        circleQueue.enqueue(18);
        circleQueue.enqueue(7);
        circleQueue.enqueue(6);
        circleQueue.enqueue(10);
        circleQueue.enqueue(11);
        circleQueue.printQueue();
        System.out.println("Removed element : " + circleQueue.dequeue());
        circleQueue.printQueue();
        circleQueue.enqueue(65);
        circleQueue.printQueue();
    }
}
