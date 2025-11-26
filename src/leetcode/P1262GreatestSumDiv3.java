package leetcode;

public class P1262GreatestSumDiv3 {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,4};
        System.out.println(maxSumDivThree(nums));
    }

    public static int maxSumDivThree(int[] nums) {
        int[] DP = new int[] {0, Integer.MIN_VALUE, Integer.MIN_VALUE}; // DP[0] = best sum %3 ==0, DP[1] = ... %3==1, [2]%3==2
        int[] newDP = new int[3];
        int modNow = 0;
        newDP =  DP.clone();
        for (int num : nums) {
            
            for (int mod = 0; mod < 3; mod++) {
                if (DP[mod] == Integer.MIN_VALUE) continue;
                
                modNow = (mod + num)%3;
                int candidate = num + DP[mod];
                if (candidate > newDP[modNow]) newDP[modNow] = candidate;
                for (int n : newDP) {System.out.print(n + " ");} //TODO remove
                System.out.println(); //TODO remove
            }
            DP = newDP.clone();
        }


        return DP[0];
    }
}
