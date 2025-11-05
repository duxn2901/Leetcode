package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P187 {
    public List<String> findRepeatedDnaSequences(String s) {
        int left = 0;
        String current = "";
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Boolean> seen = new HashMap<>();
        if (s.length()<=10) return list;
        for (int right = 10; right <= s.length(); right++) {
            current = s.substring(left,right);
            if (seen.containsKey(current)) {
                if (seen.get(current) == false) {
                    list.add(current);
                    seen.put(current, true);
                }               
            }
            else {
                seen.put(current, false);
            }
            left++;
        }
        return list;
        
    }
}
