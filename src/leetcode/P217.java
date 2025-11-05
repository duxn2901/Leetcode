package leetcode;

import java.util.HashSet;

public class P217 {
    public boolean containsDuplicate(int[] nums) {
        var seen = new HashSet<>();
        for (int i : nums) {
            if (!seen.add(i)) return true;
        }
        return false;
        
    }
}
