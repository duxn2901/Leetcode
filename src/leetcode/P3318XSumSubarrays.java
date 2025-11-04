package leetcode;

import java.util.HashMap;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class P3318XSumSubarrays {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4,2,3};
        int k = 6;
        int x = 2;
        System.out.println(Arrays.toString(findXSum(nums, k, x)));
    }

    public static int[] findXSum(int[] nums, int k, int x) {
        int countSubarrays = nums.length - k + 1;
        int[] result = new int[countSubarrays];
        int index = 0;
        int left = 0;
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int right = 0; right < nums.length; right++) {
            
            seen.put(nums[right], seen.getOrDefault(nums[right],0) +1);
            
            if (right - left + 1 == k) {
                result[index++] = xSum(seen, x);
                seen.put(nums[left], seen.get(nums[left])-1);
                if (seen.get(nums[left]) == 0) seen.remove(nums[left]);
                left++;
            }
        }



        return result;
    }

    public static int xSum(HashMap<Integer,Integer> map, int x) {
        //[number,frequency] conmpare frequency, then number tiebreaker
        Queue<int[]> queue = new PriorityQueue<>(
            (a,b) -> {
            if (a[1] != b[1]) return Integer.compare(b[1], a[1]);
            return Integer.compare(b[0], a[0]);});
        int sum = 0;
        for (int number : map.keySet()) {
            queue.offer(new int[] {number, map.get(number)});
        }
        if (queue.size() < x) {
            for (int num : map.keySet()) sum += num * map.get(num);
        }
        else {
            for (int i = 0; i < x; i++) {
                int[] numfreq = queue.poll();
                sum += numfreq[0] * numfreq[1];
            }
        }
        return sum;
    }
}
