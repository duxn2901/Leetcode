package leetcode;

public class P0011ContainerMostWater {
    public int maxArea(int[] height) {
        int max = -1;
        int left = 0;
        int right = height.length-1;
        while (left<right) {
            int temp = Math.min(height[left], height[right]) * (right - left);
            if (temp > max) max = temp;
            if (height[left] < height[right]) {
                left++;
            }
            else right--;
        }
        return max;
    }
}
