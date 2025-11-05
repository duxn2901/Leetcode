package leetcode;

import java.util.HashSet;

public class P3 {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;       
        int max = 0;
        HashSet<Character> seen = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            while (seen.contains(c)) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(c);
            max = (right-left+1>max)? right-left+1 : max;   
        }   
        return max;   
    }
}
