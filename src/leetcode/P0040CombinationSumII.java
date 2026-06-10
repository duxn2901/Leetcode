package leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P0040CombinationSumII {
    public static void main(String[] args) {
        int[] candidates = new int[] {10, 1, 2, 7, 6, 1, 5};
        System.out.println(combinationSum2(candidates, 8));
    }

    static List<Integer> current = new ArrayList<>();
    static List<List<Integer>> answer = new ArrayList<>();

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        answer.clear();
        int[] temp = candidates;
        Arrays.sort(temp);
        backtracking(temp, target, 0);
        return answer;
    }

    public static void backtracking(int[] candidates, int remaining, int index) {
        if (remaining == 0) {
            answer.add(new ArrayList<>(current));
            return;
        }

        if (index >= candidates.length) {
            
            return;
        }

        if (remaining < 0) {
            
            return;
        }

        

        current.add(candidates[index]);
        
        backtracking(candidates, remaining-candidates[index], index+1);
        current.remove(current.size()-1);
        
        while (index < candidates.length-1 && candidates[index] == candidates[index+1]) {
            index++;
        }
        backtracking(candidates, remaining, index+1);
    }
}
