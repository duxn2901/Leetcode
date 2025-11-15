package leetcode;

import java.util.ArrayList;

public class P0155MinStack {
    class MinStack {
        ArrayList<int[]> stack = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        

        public MinStack() {
            
        }
        
        public void push(int val) {
            if (val<min) min = val;
            stack.add(new int[] {val, min});
            
        }
        
        public void pop() {
            stack.remove(stack.size()-1);
            
            if (stack.isEmpty()) min = Integer.MAX_VALUE;
            else min = stack.get(stack.size()-1)[1];
        }
        
        public int top() {
            return stack.get(stack.size()-1)[0];
        }
        
        public int getMin() {
            return stack.get(stack.size()-1)[1];
        }
    }   
}
