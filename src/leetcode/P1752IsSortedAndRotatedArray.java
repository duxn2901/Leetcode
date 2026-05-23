package leetcode;

public class P1752IsSortedAndRotatedArray {
    public boolean check(int[] nums) {
        int count = 2;
        for (int i = 1; i < nums.length; i++) {
            
            if (nums[i] < nums[i-1]) count--;
            if (count < 2 && nums[i] > nums[0]) return false;
        }
        return count > 0;
    }
}
