package StackQueue.queueusingstack;
import StackQueue.Stack;

public class QueueUsingStack {
  Stack stack1;
  Stack stack2;

    public QueueUsingStack() {
        this.stack1 = new Stack();
        this.stack2 = new Stack();
    }

    public void enqueue(int data){
      stack1.push(data);
        System.out.println("Enqueued : "+ data);
  }
  public int dequeue(){
      if (stack2.isEmpty()) {
          if (stack1.isEmpty()) {
              throw new RuntimeException("Queue is empty");
          }
          // Transfer all elements from enqueueStack to dequeueStack
          while (!stack1.isEmpty()) {
              stack2.push(stack1.pop());

          }
      }
      System.out.println("dequeued : "+ stack2.peek());

      return stack2.pop();
      }
      public boolean isEempty(){
          return stack1.isEmpty() && stack2.isEmpty();

      }
    public int peek() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            // Transfer all elements from enqueueStack to dequeueStack
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }


}

