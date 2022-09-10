package com.gecg;
import java.util.*;

public class StackJavaCollection {

/* push at bottom of stack
    Algorithm :
    We use recursive way here
    we do that we pop an all element and if stack is empty then we have to push our new data
    then joint that old stack with this data
 */

    public static void pushAtBottom(int data , Stack<Integer> s)
    {
        if (s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data , s);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> stack)
    {
        if (stack.isEmpty())
        {
            return;
        }

        int top = stack.pop();
        reverseStack(stack);
        pushAtBottom(top , stack);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(45);
        stack.push(93);
        stack.push(18);
        stack.push(10);
        stack.push(33);
        stack.pop();
        System.out.println("The peek is : " + stack.peek());
        pushAtBottom(7 , stack);
        reverseStack(stack);
        while (!stack.isEmpty())
        {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
    }
}
