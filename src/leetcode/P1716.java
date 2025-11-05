package leetcode;

public class P1716 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(totalMoney(n));
    }

    public static int totalMoney(int n) {
        int total = 0;
        int today = 1;
        int monday = 0;
        for (int i = 1; i <= n; i++ ) {
            if (i % 7 == 1) {
                monday++;
                today = monday;
            }
            total += today;
            today++;
        }
        return total;

    }
}
