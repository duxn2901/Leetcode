package leetcode;

public class P27 {
    public int removeElement(int[] nums, int val) {
        int i = 0; // Zeiger für die nächste gültige Position

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j]; // in-place verschieben
                i++;
            }
        }

        return i; // k = Anzahl der Elemente != val
    }
}
