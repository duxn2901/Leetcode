package leetcode;

public class P0020ValidParentheses {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                top++;
                stack[top] = s.charAt(i);
            } 
            if (s.charAt(i) == ')') {
                if (top < 0 || stack[top] != '(') return false;
                top--;
            }
            if (s.charAt(i) == ']') {
                if (top < 0 || stack[top] != '[') return false;
                top--;
            }
            if (s.charAt(i) == '}') {
                if (top < 0 || stack[top] != '{') return false;
                top--;
            }
        }
        return top >= 0;
    }
}
