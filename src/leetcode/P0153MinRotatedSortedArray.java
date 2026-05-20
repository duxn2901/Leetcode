package leetcode;

public class P0153MinRotatedSortedArray {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int mid;
        while (left <= right) {
            mid = (left+right)/2;
            if (mid > 0 && nums[mid] < nums[mid-1]) return nums[mid];
            if (nums[mid] > nums[right]) {
                left = mid+1;
            } 
            else right = mid-1;
        }

        return nums[left];
    }
}
