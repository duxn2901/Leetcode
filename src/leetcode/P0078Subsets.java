package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0078Subsets {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subsets(arr));
    }

    static List<List<Integer>> answer;
    public static List<List<Integer>> subsets(int[] nums) {
        answer = new ArrayList<>();
        helper(nums, 0, new ArrayList<>());
        return answer;
    }

    public static void helper(int[] nums, int index, List<Integer> current) {
        if (index >= nums.length) {
            answer.add(new ArrayList<>(current));
            return;
        }
        helper(nums, index+1, new ArrayList<>(current));
        ArrayList<Integer> newList = new ArrayList<>(current);
        newList.add(nums[index]);
        helper(nums, index+1, newList);
    }
}
