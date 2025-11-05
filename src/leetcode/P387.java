package leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class P387 {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> dict = new LinkedHashMap<>();
        HashMap<Character, Integer> dict2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (dict.containsKey(s.charAt(i))) {dict.put(s.charAt(i), dict.get(s.charAt(i))+1);} else {
                dict.put(s.charAt(i),1);
                dict2.put(s.charAt(i),i);
                }          
        }
        for (char c : dict.keySet()) {
            if (dict.get(c) == 1) return dict2.get(c);
        }
        return -1;
    }
}
