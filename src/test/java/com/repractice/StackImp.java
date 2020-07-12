package com.repractice;

public class StackImp {
int arr[];
int size;
int top;
public StackImp(int size){
    this.size = size;
    arr = new int[size];
    top = -1;
}

public void push(int element) {
    if(!isFull()) {
        top++;
        arr[top]= element;
        System.out.println("pushed element :"+ element);
    } else {
        System.out.println("stack is full");
    }
}

public int pop() {
    if(!isEmpty()) {
        int returnedTop = top;
        top--;
        System.out.println("popped element : "+ arr[returnedTop]);
        return arr[returnedTop];
    } else {
        System.out.println("stack is empty");
        return -1;
    }
}
    public boolean isEmpty() {
     return (top == -1);
    }
    public boolean isFull() {
    return (size-1 == top);
    }

    public int peek() {
    if(!isEmpty()) {
        return arr[top];
    } else {
        System.out.println("stack empty");
        return -1;
    }
    }
    public static void main(String[] args) {
        StackImp st = new StackImp(10);
        st.push(10);
        st.push(20);
        st.peek();
        st.pop();
        st.peek();
        st.pop();
        st.peek();
    }
}
