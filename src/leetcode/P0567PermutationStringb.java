package leetcode;

import java.util.Arrays;



public class P0567PermutationStringb {
    public static void main(String[] args) {
        
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int l = 0;
        int r = 0;
        int[] target = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            target[s1.charAt(i) - 'a']++;
        }
        
        int[] seen = new int[26];
        while (r < s1.length()) {
            seen[s2.charAt(r) - 'a']++;
            r++;
        }

        if (Arrays.equals(target, seen)) return true;
        while (r < s2.length()) {
            seen[s2.charAt(r)- 'a']++;
            if (seen[s2.charAt(l) - 'a'] != 0) seen[s2.charAt(l) - 'a']--;
            if (Arrays.equals(target, seen)) return true;
            l++;
            r++;
        }

        return false;
    }
}
