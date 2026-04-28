package leetcode;
/*
idea: P1 can win if:
1. P1s turn, P1 can choose either left or right and win (left or right == ||)
2. P2s turn, P2 loses no matter the choice left or right (negation(left or right) == &&) 
3. Base case at left > right
*/
public class P0486PredictWinner {
    public boolean predictTheWinner(int[] nums) {
        return helper(nums, 0, 0, 0, nums.length -1, 1);
    }

    public boolean helper(int[] nums, int score1, int score2, int left, int right, int turn){
        if (left > right) return score1 >= score2;
        if (turn == 1) return helper(nums, score1+nums[left], score2, left+1, right, 2) || helper(nums, score1 + nums[right], score2, left, right-1, 2);
        return helper(nums, score1, score2+nums[left], left+1, right,1) && helper(nums, score1, score2+nums[right], left, right-1, 1);
    }
}
