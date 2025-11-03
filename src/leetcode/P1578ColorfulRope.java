package leetcode;

public class P1578ColorfulRope {
    public static void main(String[] args) {
        String colors = "aabaa";
        int[] neededTime = new int[] {1,2,3,4,1};
        System.out.println(minCost(colors, neededTime));
    }

    public static int minCost(String colors, int[] neededTime) {
        int time = 0;
        int left = 0;
        int right = 1;
        int len = neededTime.length;

        while (right < len) {
            int rTime = neededTime[right];
            int lTime = neededTime[left];
            if (colors.charAt(left) == colors.charAt(right)) {
                if (lTime >= rTime) {
                    time += rTime;
                    right++;
                }
                else {
                    time += lTime;
                    left = right;
                    right++;
                }
            }
            else {
                left = right;
                right++;
            }
        }
        return time;
    }
}

