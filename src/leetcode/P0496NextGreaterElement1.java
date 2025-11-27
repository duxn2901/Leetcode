package leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;

public class P0496NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[nums1.length];
        Arrays.fill(result, -1);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], i);
        }

        for (int num : nums2) {
            while (stack.peek() != null && num > stack.peek()) {
                int top = stack.pop();
                if (map.containsKey(top)) {
                    result[map.get(top)] = num;
                }
            }


            if (stack.isEmpty() || stack.peek() > num) {
                stack.push(num);
            }
        }
        return result;
    }
}
