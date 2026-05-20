package leetcode;

import java.util.ArrayDeque;

public class P0084LargestRectangleHistogram {
    public static void main(String[] args) {
        System.out.println(largestRectangleArea(new int[] {2,4}));
    }
    public static int largestRectangleArea(int[] heights) {
        ArrayDeque<int[]> deque = new ArrayDeque<>();

        int max = 0;
        int[] popArr = new int[2];
        for (int i = 0; i < heights.length; i++) {

            popArr[0] = i;
            while (!deque.isEmpty() &&heights[i] < deque.getLast()[1]) {
                popArr = deque.pollLast();
                int area = popArr[1] * (i-popArr[0]);
                max = Math.max(max, area);
                // System.out.println("Max" + max);
            }
            if (deque.isEmpty()) {
                deque.offerLast(new int[] {0, heights[i]});
            }
            else {
                deque.offerLast(new int[] {popArr[0], heights[i]});
            }
            // for (int[] arr : deque) {
            //     for (int x : arr) System.out.print(x +"\t" );
            // }
            // System.out.println();
        }

        for (int[] arr : deque) {
            max = Math.max(max, arr[1] * (heights.length - arr[0]));
        }
        return max;
        
    }
}
