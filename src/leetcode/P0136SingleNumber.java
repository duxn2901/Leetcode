package leetcode;
public class P0136SingleNumber {
    public static void main(String[] args) {
        System.out.println(3^7);
    }

    public int singleNumber(int[] nums) {
        int temp = 0;
        for (int i: nums) {
            temp = temp^i;
        }
        return temp;
    }
}
