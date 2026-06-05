package leetcode;

public class P1929ConcatenationArray {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length*2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[i%nums.length];
        }
        return arr;
    }
}
