package leetcode;

import java.util.HashSet;

public class P2133 {
    public boolean checkValid(int[][] matrix) {
        int len = matrix.length;
        @SuppressWarnings("unchecked")
        HashSet<Integer>[] rowSeen = new HashSet[len];
        @SuppressWarnings("unchecked")
        HashSet<Integer>[] columnSeen = new HashSet[len];
        for (int i = 0; i < len; i++) {
            rowSeen[i] = new HashSet<Integer>();
            columnSeen[i] = new HashSet<Integer>();
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int num = matrix[i][j];
                rowSeen[i].add(num);
                columnSeen[j].add(num);
            }
        }
        for (int i = 0; i < len; i++) {
            if (rowSeen[i].size()!=len) return false;
            if (columnSeen[i].size()!=len) return false;
        }
        return true;
    }
}
