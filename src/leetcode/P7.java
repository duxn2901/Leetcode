package leetcode;

public class P7 {
    public int reverse(int x) {
        int res = 0;
        int num = x;
        while (num!=0) {
            if (res >= Integer.MAX_VALUE / 10 + (num%10) || res <= Integer.MIN_VALUE /10 + (num%10)) return 0;
            res = res * 10 + (num % 10);
            num /= 10;
        }
        return res;
    }
}
