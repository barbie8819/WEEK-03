package StackQueue.SlidingWindowMaximum;
import StackQueue.Stack;
public class SlidingWindow {
    public class Deque {
        class Node {
            int data;
            Node next, prev;

            public Node(int data) {
                this.data = data;
            }
        }

        Node rear, front;

        public Deque() {
            this.rear = null;
            this.front = null;
        }

        public void pushFront(int data) {
            Node newNode = new Node(data);
            if (front == null) {
                front = rear = newNode;
            } else {
                newNode.next = front;
                front.prev = newNode;
                front = newNode;
            }
        }

        public void pushBack(int data) {
            Node newNode = new Node(data);
            if (rear == null) {
                front = rear = newNode;
            } else {
                newNode.prev = rear;
                rear.next = newNode;
                rear = newNode;
            }
        }

        public void popFront() {
            if (front != null) {
                if (front == rear) {
                    front = rear = null;
                } else {
                    front = front.next;
                    front.prev = null;
                }
            }
        }

        public void popBack() {
            if (rear != null) {
                if (front == rear) {
                    front = rear = null;
                } else {
                    rear = rear.prev;
                    rear.next = null;
                }
            }
        }

        public int front() {
            return (front != null) ? front.data : -1;
        }

        public int back() {
            return (rear != null) ? rear.data : -1;
        }

        public boolean isEmpty() {
            return front == null;
        }
    }

    public int[] SlidingWindowMaximum(int[] a, int k) {
        Deque deque = new Deque();
        int[] list = new int[a.length - k + 1];
        int r=0;
        for (int i = 0; i < a.length; i++) {
            if (!deque.isEmpty() && deque.front() <= i - k) {
                deque.popFront();
            }
            while (!deque.isEmpty() && a[deque.back()] <= a[i]) {
                deque.popBack();
            }
            deque.pushBack(i);

            if (i >= k - 1) {
                list[r++] = a[deque.front()];
            }

        }
        return list;
    }

}
