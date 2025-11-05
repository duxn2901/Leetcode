package leetcode;

public class P3370 {
    public int smallestNumber(int n) {
        int x = 1;
        while (x-1<n) {
            x *= 2;
        }
        return x-1;
    }
}
