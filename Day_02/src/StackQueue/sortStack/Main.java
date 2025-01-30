package StackQueue.sortStack;

import StackQueue.Stack;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(4);
        s.push(6);
        s.push(2);
        s.push(5);
        s.push(9);
        System.out.println("Unsorted Stack :");
        s.print();
        SortStack sortedStack = new SortStack();
        sortedStack.sort(s);
        System.out.println("Sorted Stack :");
        s.print();

        }


    }


