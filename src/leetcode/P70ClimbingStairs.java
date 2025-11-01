package leetcode;

public class P70ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }
    
    public static int climbStairs(int n) {
        int first = 0;
        int second = 1;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;  
    }
}