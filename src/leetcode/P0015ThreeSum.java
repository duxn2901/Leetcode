package leetcode;

import java.util.*;

public class P0015ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        int j,k;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            j = i+1;
            k = nums.length-1;
            int target = -1*nums[i];
            while (j < k) {
                if (nums[j] + nums[k] == target) {
                    answer.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    do { 
                        j++;
                    } while (j < nums.length && nums[j] == nums[j-1]);
                    k = nums.length-1;
                }
                else if (nums[j] + nums[k] > target) {
                    do { 
                        k--;
                    } while (k > 0 && nums[k] == nums[k+1]);
                }

                else if (nums[j] + nums[k] < target) {
                    do { 
                        j++;
                    } while (j < nums.length && nums[j] == nums[j-1]);
                }
            }
        }
        return answer;
    }
}
