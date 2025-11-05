package leetcode;

public class P504 {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        boolean negative = false;
        int n = num;
        if (n==0) return "0";
        if (n<0) {
            negative = true;
            n = -n;
        }
        while (n!=0) {
            sb.append(n%7);
            n /= 7;
        }
        if (negative) sb.append("-");
        return sb.reverse().toString();
    }
}
