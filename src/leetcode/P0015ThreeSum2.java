package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P0015ThreeSum2 {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        int j,k;
        for (int i = 0; i < nums.length-2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            if (nums[i] > 0) break;
            j = i+1;
            k = nums.length-1;
            int target = -1*nums[i];
            while (j < k) {
                int sum = nums[j] + nums[k];
                if (sum == target) {
                    answer.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while (j < k && nums[j] == nums[j-1]) j++;
                    k--;
                    while (k > j && nums[k] == nums[k+1]) k--;
                }
                else if (sum > target) {
                    k--;
                    while (k > 0 && nums[k] == nums[k+1]) k--;
                }

                else if (sum < target) {
                    j++;
                    while (j < nums.length && nums[j] == nums[j-1]) j++;
                }
            }
        }
        return answer;
    }
}
