package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class P0901OnlineStockSpan {
  private Deque<int[]> stack;
    public P0901OnlineStockSpan() {
        stack = new ArrayDeque<>();
    }
    
    public int next(int price) {
        int count = 1;
        while (true) {
            if (stack.isEmpty() || price < stack.peek()[0]) {
                stack.push(new int[] {price,count});
                break;
            }
            if (price >= stack.peek()[0]) {
                count+= stack.pop()[1];
            }
        }
        return count;
    }
}
