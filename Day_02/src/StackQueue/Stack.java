package StackQueue;

public class Stack{
    public class stack {
        int data;
        stack next;

        public stack(int data) {
            this.data = data;
        }
    }

    public stack top;
    public void push(int data) {
        stack item = new stack(data);
        item.next= top;
        top=item;
    }
    public int pop() {
        int item = top.data;
       top=top.next;
       return item;
    }
    public boolean isEmpty() {
        if(top==null)
            return true;
        return false;
    }
    public int peek() {
        if(top==null)
        {
            return -1;
        }
        else{
            return top.data;
        }
    }



}
