package leetcode;

public class P0168ExcelColumnTitle {
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }
    
    public static String convertToTitle(int columnNumber) {
        String ans = "";
        int num = columnNumber;
        while (num != 0) {
            ans = Character.toString((num-1)%26 +65) + ans;
            num = (num-1)/26;
        }
        return ans;
    }
}
