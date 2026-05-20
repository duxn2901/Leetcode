package leetcode;

import java.util.ArrayDeque;

public class P0084LargestRectangleHistogram {
    public int largestRectangleArea(int[] heights) {
        ArrayDeque<int[]> deque = new ArrayDeque<>();

        int max = 0;
        int[] popArr = new int[2];
        for (int i = 0; i < heights.length; i++) {
            while (!deque.isEmpty() &&heights[i] < deque.getLast()[1]) {
                popArr = deque.pollLast();
                int area = popArr[1] * (i-popArr[0]);
                max = Math.max(max, area);
            }
            if (deque.isEmpty()) {
                deque.offerLast(new int[] {0, heights[i]});
            }
            else {
                deque.offerLast(new int[] {popArr[0], heights[i]});
            }
        }

        for (int[] arr : deque) {
            max = Math.max(max, arr[1] * (arr[0] - heights.length+1));
        }
        return max;
        
    }
}
