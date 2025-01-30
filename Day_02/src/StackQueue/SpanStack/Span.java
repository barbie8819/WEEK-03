package StackQueue.SpanStack;

import StackQueue.Stack;

public class Span {
    public  int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack s = new Stack();
        for (int i = 0; i < n; i++) {
          while (!s.isEmpty() && prices[s.peek()] <= prices[i]) {
                s.pop();
            }

            span[i] = s.isEmpty() ? (i + 1) : (i - s.peek());

            s.push(i);
        }
        return span;
    }
}
