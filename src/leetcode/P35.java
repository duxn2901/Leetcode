package leetcode;

public class P35 {
    public int searchInsert(int[] nums, int target) {
        int mid = 0;
        int left = 0;
        int right = nums.length-1;
        if (nums[left] > target) return 0;
        if (nums[right]< target) return right +1;
        while (left<=right) {
            mid = (left+right)/2;
            if (nums[mid] == target) return mid;
            if (nums[mid] >= target) right = mid;
            if (nums[mid] <= target) left = mid;
            if (right - left == 1) {
                if (nums[left] == target) return left;
                else return right;
            }

        }
        return 0;
    }
}
