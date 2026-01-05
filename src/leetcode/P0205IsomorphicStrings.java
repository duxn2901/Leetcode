package leetcode;

import java.util.HashMap;

public class P0205IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (!map.containsKey(charS)) {
                if (map.values().contains(charT)) return false;
                map.put(charS, charT);
            } 
            else {
                if (map.get(charS) != charT) return false;
            }
        }
        return true;
    }
}
