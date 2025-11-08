package leetcode;

public class P29 {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        boolean positive = (dividend >= 0 && divisor >0 || dividend <= 0 && divisor <0)? true : false;
        int dividend1 = (dividend>=0)? dividend : -dividend;
        int divisor1 = (divisor>0)? divisor : -divisor;
        int res = 0;
        while (dividend1 >= divisor1) {
            res++;
            dividend1 -= divisor1;
        }
        return (positive)? res : -res;
    }
}
