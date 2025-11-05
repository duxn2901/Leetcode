package leetcode;

import java.util.HashMap;

public class P389 {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> dict = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (dict.containsKey(c)) {dict.put(c, dict.get(c)+1);} else dict.put(c,1);

        }
        for (char c : t.toCharArray()) {
            if (!dict.containsKey(c) || dict.get(c)<=0) return c;
            dict.put(c, dict.get(c)-1);
        }
        return 'x';
    }
}
