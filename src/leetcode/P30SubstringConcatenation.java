package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P30SubstringConcatenation {
    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = {"foo","bar"};
        System.out.println(findSubstring(s, words));
    }
    public static List<Integer> findSubstring(String s, String[] words) {
        ArrayList<Integer> result = new ArrayList<>();
        if (s.length() < words.length * words[0].length()) return result;
        HashMap<String, Integer> wordHashMap = new HashMap<>();
        HashMap<String, Integer> seen = new HashMap<>();
        for (String word : words) wordHashMap.put(word, wordHashMap.getOrDefault(word, 0)+1);
        int wordLength = words[0].length();
        int left;
        int right = 0;
        for (int modulo = 0; modulo < wordLength; modulo++) { // check for each offsets of string s. ie. len = 3 => check for 036, 147, 258
            left = modulo; right = modulo;
            seen.clear();
            while (right + wordLength <= s.length()) {
                String wordNow = s.substring(right, right+wordLength);
                right += wordLength;
                if (!wordHashMap.containsKey(wordNow)) { //abort attempt, check new one
                    left = right;             
                    seen.clear();
                    
                }
                else { //word is in map
                    seen.put(wordNow, seen.getOrDefault(wordNow, 0)+1);
                    while (seen.get(wordNow) > wordHashMap.get(wordNow)) {
                        String mostLeftWord = s.substring(left, left+wordLength);
                        seen.put(mostLeftWord, seen.get(mostLeftWord)-1);
                        left += wordLength;
                    }
                    if (right-left == words.length * wordLength) result.add(left);
                }
            }
        }
        return result;
        
    }
}
