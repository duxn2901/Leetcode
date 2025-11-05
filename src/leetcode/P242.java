package leetcode;

public class P242 {
    public boolean isAnagram(String s, String t) {
        var letters = new int[26];
        for (char c : s.toCharArray()) letters[c-'a']++;
        for (char c : t.toCharArray()) letters[c-'a']--;
        for (int n : letters) {
            if (n!=0) return false;
        }
        return true;    
    }
}
