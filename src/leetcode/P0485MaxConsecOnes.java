package leetcode;

public class P0485MaxConsecOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;
        for (int i : nums) {
            if (i == 1) {
                current++;
                max = Math.max(max, current);
            }
            else current = 0;
        }
        return max;
    }
}
