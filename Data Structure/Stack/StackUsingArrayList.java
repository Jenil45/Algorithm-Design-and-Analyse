package com.gecg;

import java.util.*;
import java.util.ArrayList;


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
