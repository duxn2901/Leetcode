package leetcode;

import java.util.HashMap;

public class P169 {
    public int majorityElement(int[] nums) {
        float target = nums.length /2;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i : nums) {
            if (freq.containsKey(i)) {
                freq.put(i, freq.get(i)+1);
            } else {
                freq.put(i,1);
            }
            if (freq.get(i) > target) return i;
        }
        return 0;
        
    }
}
