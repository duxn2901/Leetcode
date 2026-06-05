package leetcode;

public class P1470ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int l = 0;
        int r = n;
        int[] arr = new int[2*n];
        for (int i = 0; i < 2*n; i+=2) {
            arr[i] = nums[l];
            arr[i+1] = nums[r];
            l++; r++;
        }
        return arr;
    }
}
