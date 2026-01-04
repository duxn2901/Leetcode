package leetcode;

public class P0171ExcelColumnNumber {
    public static void main(String[] args) {
        System.out.println(titleToNumber("ZY"));
    }

    public static int titleToNumber(String columnTitle) {
        int ans = 0;
        int exponent = columnTitle.length()-1;
        for (int i = 0; i < columnTitle.length(); i++) {
            ans += (Math.pow(26, exponent)) * (Integer.valueOf(columnTitle.charAt(i)) - 64);
            exponent--;
        }
        return ans;
    }
}
