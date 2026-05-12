package leetcode;

public class P0074Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length * matrix[0].length-1;

        while (left <= right) {
            int mid = (left+right)/2;
            int n = matrix[mid/matrix[0].length][mid%matrix[0].length];
            if (n == target) return true;
            if (n > target) right = mid-1;
            else left = mid+1;
        }
        return false;
    }
}
