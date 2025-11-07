package leetcode;

public class P74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int rows = matrix.length;
        int columns = matrix[0].length;
        int right =  rows * columns -1;
        int mid, row, column;
        while (left <= right) {
            mid = (left + right) /2;
            row = mid / columns;
            column = mid % columns;
            
            if (matrix[row][column] == target) return true;
            if (matrix[row][column] < target) {
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }    
        return false;
    }
}
