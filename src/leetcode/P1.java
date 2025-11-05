package leetcode;

import java.util.HashMap;

public class P1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> missing = new HashMap<>();
        var answer = new int[2];
        for (int i = 0; i<nums.length; i++) {
            if (missing.containsKey(nums[i])) {
                answer[0] = i;
                answer[1] = missing.get(nums[i]);
                return answer;
            }
            missing.put(target - nums[i], i);
        }
        return answer;
    }
}
