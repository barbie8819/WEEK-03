package StackQueue.sortStack;
import StackQueue.Stack;
public class SortStack {


    public void sort(Stack s){
        if(!s.isEmpty()) {
            int top = s.peek();
            s.pop();
            sort(s);
            insert(s,top);


        }
    }
    public void insert(Stack s,int data){
        if(s.isEmpty() || s.peek()<data){
            s.push(data);
            return;
        }
        int top = s.peek();
        s.pop();
        insert(s,data);
        s.push(top);

    }

}
