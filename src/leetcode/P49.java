package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class P49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        HashMap<String, Integer> frequency = new HashMap<>();
        int index = 0;
        for (String s : strs) {
            int[] letters = new int[26];
            for (char c : s.toCharArray()) {
                letters[c-'a']++;
            }
            String key = Arrays.toString(letters);
            if (frequency.containsKey(key)) {
                answer.get(frequency.get(key)).add(s);
            } else {
                frequency.put(key, index);
                answer.add(new ArrayList<>());
                answer.get(index).add(s);
                index++;
            }

        }
        return answer;

    }
}
