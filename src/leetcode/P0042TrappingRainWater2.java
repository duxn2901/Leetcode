package leetcode;

public class P0042TrappingRainWater2 {
    public int trap(int[] height) {
        int[] heightLeftWall = new int[height.length];
        int[] heightRightWall = new int[height.length];
        int water = 0;

        int maxHeight = -1;
        for (int i = 0; i < height.length; i++) {
            maxHeight = Math.max(maxHeight, height[i]);
            heightLeftWall[i] = maxHeight;
        }

        maxHeight = -1;
        for (int i = height.length-1; i >= 0; i--) {
            maxHeight = Math.max(maxHeight, height[i]);
            heightRightWall[i] = maxHeight;
        }

        for (int i = 0; i < height.length; i++) {
            water += Math.min(heightLeftWall[i], heightRightWall[i]) - height[i];
        }
        return water;
    }
}
