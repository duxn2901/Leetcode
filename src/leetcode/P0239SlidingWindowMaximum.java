package leetcode;

import java.util.ArrayDeque;

public class P0239SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        maxSlidingWindow(arr, 3);
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int[] answer = new int[nums.length-k+1];
        int left = 0;
        int right = 0;
        int i = 0;

        while (right < nums.length) {

            while (!deque.isEmpty() && nums[right] > deque.getLast()) deque.pollLast();
            deque.addLast(nums[right]);
            right++;

            if (right >= k) {
                answer[i] = deque.getFirst();
                i++;

                if (!deque.isEmpty() && nums[left] == deque.getFirst()) deque.pollFirst();
                left++;
            }
        }
             
        return answer;
    }
}
