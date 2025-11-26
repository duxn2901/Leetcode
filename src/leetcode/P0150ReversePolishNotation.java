package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class P0150ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int a,b;
        for (String s : tokens) {
            switch (s) {
                case ("+"): {
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b+a);
                    break;
                }
                case ("-"): {
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b-a);
                    break;
                }
                case ("*"): {
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b*a);
                    break;
                }
                case ("/"): {
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b/a);
                    break;
                }
                default: {stack.push(Integer.parseInt(s)); break;}
            }
        }
        return stack.peek();
    }
}
