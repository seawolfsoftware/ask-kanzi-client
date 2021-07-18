package com.askkanzi;

public class StackX {
    private final int SIZE = 20;
    private int[] st;
    private int top;

    // constructor
    public StackX(){
        st = new int[SIZE];     // make array
        top = -1;
    }   // end constructor

    // put item on stack
    public void push(int j){
        st[++top] = j;
    }

    // take item off stack
    public int pop(){
        return st[top--];
    }

    // peek at top of stack
    public int peek(){
        return st[top];
    }

    // true if nothing on stack
    public boolean isEmpty(){
        return (top == -1);
    }
}   // end class StackX
