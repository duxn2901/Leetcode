package leetcode;

public class P303 {
    public static void main(String[] args) {
        int[] nums = new int[] {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);
        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));
        System.out.println(numArray.sumRange(0, 5));
    }

    static class NumArray {
        public int[] sumPrefix;
    public NumArray(int[] nums) {
        this.sumPrefix = new int[nums.length];
        this.sumPrefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sumPrefix[i] = sumPrefix[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return (left == 0)? (sumPrefix[right]) : (sumPrefix[right]-sumPrefix[left-1]);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
}
