package leetcode;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class P0503NextGreaterElement2 {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        boolean[] isInStack = new boolean[nums.length];
        Arrays.fill(res, -1);
        Arrays.fill(isInStack, false);
        Deque<Integer> stack = new ArrayDeque<>();
        int index = 0;
        while (true) {
            while (!stack.isEmpty() && nums[index] > nums[stack.peek()]) {
                int top = stack.pop();
                res[top] = nums[index];
                isInStack[top] = false;
            }
            if (!stack.isEmpty() && stack.peek() == index) {
                break;
            }
            if (isInStack[index] == true) break;
            stack.push(index);
            isInStack[index] = true;
            if (index == nums.length-1) index = 0;
            else index++;
        }
        return res;
    }
}
