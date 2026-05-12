package leetcode;

public class P0042TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {0, 2, 0, 3, 1, 0, 1, 3, 2, 1};
        System.out.println(trap(arr));
    }
    public static int trap(int[] height) {
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        int waterHeight = 0;

        leftMax[0] = height[0];
        rightMax[rightMax.length-1] = height[height.length-1];

        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        for (int i = height.length-2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        for (int i = 0; i < height.length; i++) {
            waterHeight += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        
        // for (int i : leftMax) System.out.print(i + "\t");
        // System.out.println();
        // for (int i : rightMax) System.out.print(i + "\t");

        return waterHeight;
    }
}
