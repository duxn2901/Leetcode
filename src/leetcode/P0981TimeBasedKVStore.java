package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class P0981TimeBasedKVStore {
    class TimeValuePair {
        int time;
        String value;

        public TimeValuePair(int time, String value) {
            this.time = time;
            this.value = value;
        }

        
    }

    class TimeMap {


    HashMap<String, ArrayList<TimeValuePair>> map;
    public TimeMap() {
        map = new HashMap<>();    
    }
    
    public void set(String key, String value, int timestamp) {
        if (map.containsKey(key)) map.get(key).add(new TimeValuePair(timestamp, value));
        else {
            map.put(key, new ArrayList<>());
            map.get(key).add(new TimeValuePair(timestamp, value));
        }
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";
        // if (map.get(key).containsKey(timestamp)) return map.get(key).get(timestamp);
        ArrayList<TimeValuePair> list = map.get(key);
        int l = 0;
        int r = map.get(key).size()-1;
        int result = -1;
        while (l<=r) { 
            int mid = (l+r) /2;
            if (list.get(mid).time <= timestamp) {
                l = mid +1;
                result = mid;
            }
            
            else r = mid-1;
                      
        }
        if (result == -1) return "";
        return map.get(key).get(result).value;
        }
    }
}
