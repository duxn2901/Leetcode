package leetcode;

import java.util.HashMap;

public class P0567PermutationString {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eibao"));
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int l = 0;
        int r = 0;
        HashMap<Character, Integer> target = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            target.put(s1.charAt(i), target.getOrDefault(s1.charAt(i), 0) + 1);
        }
        
        HashMap<Character, Integer> seen = new HashMap<>();
        while (r < s1.length()) {
            seen.put(s2.charAt(r), seen.getOrDefault(s2.charAt(r), 0) + 1);
            r++;
        }

        if (target.equals(seen)) return true;
        while (r < s2.length()) {
            seen.put(s2.charAt(r), seen.getOrDefault(s2.charAt(r), 0) +1);
            if (seen.get(s2.charAt(l)) == 1) seen.remove(s2.charAt(l));
            else seen.put(s2.charAt(l), seen.get(s2.charAt(l)) -1);
            if (target.equals(seen)) return true;
            l++;
            r++;
        }

        return false;
    }
}
