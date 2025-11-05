package leetcode;

import java.util.HashMap;

public class P383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> dictMagazine = countLetters(magazine);     
        for (char c : ransomNote.toCharArray()) {
            if (!dictMagazine.containsKey(c) || dictMagazine.get(c) <= 0) return false;
        dictMagazine.put(c, dictMagazine.get(c)-1);

        }
        return true;       
    }

    public HashMap<Character, Integer> countLetters(String n) {
        HashMap<Character, Integer> dict = new HashMap<>();
        for (char c : n.toCharArray()) {
            if (dict.containsKey(c)) {
                dict.put(c, dict.get(c)+1);
            }
            else {
                dict.put(c,1);
            }
        } 
    return dict;
    }
}
