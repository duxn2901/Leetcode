package leetcode;

public class P9 {
    public boolean isPalindrome(int x) {
        int x_new = x;
        int x_reverse = 0;
        while (x_new > 0) {
            x_reverse = (x_reverse * 10) + (x_new % 10);
            x_new /= 10;

        }
        return x == x_reverse;
    }
}
