package leetcode;


public class P0424RepeatingReplacement {
    public static void main(String[] args) {
        System.out.println(characterReplacement("ABBAA", 2));
    }
    public static int characterReplacement(String s, int k) {
        int[] frequency = new int[26];
        int left = 0;
        int right = 0;
        int maxCount = 0;
        int maxLength = 0;
        while (right < s.length()) { 
            frequency[s.charAt(right)-65]++;
            maxCount = Math.max(maxCount, frequency[s.charAt(right)-'A']);
            while (right-left+1-maxCount > k) {
                frequency[s.charAt(left)-65]--;
                left++;
            }
            maxLength = Math.max(right - left + 1, maxLength);
            right++;
        }
        return maxLength;
    }

    
}
