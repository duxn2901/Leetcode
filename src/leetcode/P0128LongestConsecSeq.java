package leetcode;
import java.util.HashSet;

public class P0128LongestConsecSeq {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int num: nums) {
            set.add(num);
        }
        for (int i : set) {
            if (!set.contains(i-1)) {
                int count = 1;
                int currentNum = i;
                while (set.contains(currentNum+1)) {
                    count++;
                    currentNum++;
                }
                result = (count>result)? count : result;
            }
        }


        return result;
    }
}
