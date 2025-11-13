package leetcode;

import java.util.HashMap;

public class P0076MinWindowSubstring {
    public String minWindow(String s, String t) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i<t.length();i++) map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)+1);
        HashMap<Character, Integer> seen = new HashMap<>();
        int minLength = s.length()+1;
        int left = 0;
        int right = 0;
        int charValid = 0;
        int start = -1;
        while (right < s.length()) {
            char charRight = s.charAt(right);
            if (map.containsKey(charRight)) {
                seen.put(charRight, seen.getOrDefault(charRight, 0)+1);
                if (seen.get(charRight) == map.get(charRight)) charValid++;
                while (charValid == map.size()) {
                    if (right - left + 1 < minLength) {
                        minLength = right - left + 1;
                        start = left;
                    }
                    char charLeft = s.charAt(left);
                    if (map.containsKey((charLeft))) {
                        seen.put(charLeft, seen.get(charLeft)-1);
                        if (seen.get(charLeft) < map.get(charLeft)) charValid--;
                    }
                    left++;
                }
            }
            right++;
        }

        if (start == -1) return "";
        return s.substring(start, start + minLength);
    }
}
