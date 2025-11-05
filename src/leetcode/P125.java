package leetcode;

public class P125 {
    public boolean isPalindrome(String s) {
        String new_string = s.toLowerCase();
        int left = 0;
        int right = new_string.length()-1;
        while (left<right) {
            while (!Character.isLetterOrDigit(new_string.charAt(left))&&left<right) left++;
            while (!Character.isLetterOrDigit(new_string.charAt(right))&&right>left) right--;
            if (new_string.charAt(left) != new_string.charAt(right)) return false;
            left++;
            right--;
        }
        return true;

    }
}
