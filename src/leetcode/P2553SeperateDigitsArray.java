package leetcode;


public class P2553SeperateDigitsArray {
    public int[] separateDigits(int[] nums) {
        int digitCount = 0;
        for (int i : nums) {
            digitCount += String.valueOf(i).length();
        }

        int[] ans = new int[digitCount];
        int indexAns = 0;
        for (int i : nums) {
            for (char c : String.valueOf(i).toCharArray()) {
                ans[indexAns++] = c - '0';
            }
        }
        return ans;    
    }
}
