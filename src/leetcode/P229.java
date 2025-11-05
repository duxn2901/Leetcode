package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P229 {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> answer = new ArrayList<>();
        float target = nums.length /3;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i : nums) {
            if (freq.containsKey(i)) {
                freq.put(i, freq.get(i)+1);
            } else freq.put(i,1);
            if (freq.get(i)>target) {
                answer.add(i);
                freq.put(i,-10000);
                }
        }
        return answer;
        
    }
}
