package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0039CombinationSum {
    static List<List<Integer>> answer;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        answer = new ArrayList<>();
        helper(candidates, target, 0, new ArrayList<>());
        
        return answer;
    }

    public void helper(int[] candidates, int remain, int index, ArrayList<Integer> current) {
        
        if (remain == 0) {
            answer.add(new ArrayList<>(current));
            return;
        }
        if (remain < 0) {
            
            return;
        }
        if (index >= candidates.length) return;

        current.add(candidates[index]);
        helper(candidates, remain-candidates[index], index, current);
        current.remove(current.size()-1);
        helper(candidates, remain, index+1, current);
    }
}
