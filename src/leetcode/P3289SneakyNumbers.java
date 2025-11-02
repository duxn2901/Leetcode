package leetcode;

import java.util.HashSet;

public class P3289SneakyNumbers {
    public static void main(String[] args) {
        int[] nums = {3,5,6,7,7,3,8,9,123};
        
        System.out.println(getSneakyNumbers(nums)[0] + " " + getSneakyNumbers(nums)[1] );
    }
    
    public static int[] getSneakyNumbers(int[] nums) {
        int[] result = new int[2];
        HashSet<Integer> seen = new HashSet<>();
        int index = 0;
        for (int i : nums) {
            if (seen.contains(i)) {
                result[index] = i;
                index++;
                if (index > 1) return result;
            }
            else seen.add(i);
        }
        return result;
    }
}