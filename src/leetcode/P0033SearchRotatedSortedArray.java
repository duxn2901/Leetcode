package leetcode;

public class P0033SearchRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(search(nums, 0));
    }
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid;
        int breakpoint;
        while (left < right) { 
            mid = (left+right)/2;
            if (nums[mid] > nums[right]) left = mid+1;
            else right = mid;
        }
        breakpoint = left;
        if (target >= nums[breakpoint] && target <= nums[nums.length - 1]) {

        left = breakpoint;
        right = nums.length - 1;

        } else {

        left = 0;
        right = breakpoint - 1;
        }   

        while (left <= right) {
            mid = (left+right)/2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) right = mid-1;
            else left = mid+1;
        }
        return -1;
    }
}
