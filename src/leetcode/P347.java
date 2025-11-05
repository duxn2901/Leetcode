package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class P347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> freq2 = new HashMap<>();
        int[] answer = new int[k];
        int count = k-1;
        for (int i : nums) {
            if (freq.containsKey(i)) {
                freq.put(i, freq.get(i)+1);
            }
            else freq.put(i,1);
        }
        for (int i = 0; i <= nums.length; i++) {
            freq2.put(i, new ArrayList<>());
        }
        for (int i : freq.keySet()) {
            freq2.get(freq.get(i)).add(i);
        }
        for (int key = nums.length; key >= 0; key--) {
            if (count < 0) break;
            ArrayList<Integer> list = freq2.get(key);
            if (list == null) continue;

            for (int i : list) {
                if (count < 0) break;
                answer[count] = i;
                count--;
            }
        }
        return answer;    
    }
}
