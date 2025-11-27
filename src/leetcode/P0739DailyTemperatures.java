package leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class P0739DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = new int[] {73,74,75,71,69,72,76,73};
        int[] res = dailyTemperatures(temperatures);
        for (int n :res) System.out.print(n + " ");
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Arrays.fill(result, 0);
        Deque<Integer> stack = new ArrayDeque<>();
        int tempNow, tempTop = Integer.MIN_VALUE;

        for (int i = 0; i < temperatures.length; i++) {
            tempNow = temperatures[i];
            if (!stack.isEmpty()) tempTop = temperatures[stack.peek()];
            while (stack.peek() != null && tempNow > tempTop) {
                int indexTop = stack.pop();
                result[indexTop] = i - indexTop;
                if (!stack.isEmpty()) tempTop = temperatures[stack.peek()];
                else tempTop= Integer.MIN_VALUE;
            }

            if (stack.isEmpty() || tempNow <= tempTop) stack.push(i);
        }
        return result;
    }
}
