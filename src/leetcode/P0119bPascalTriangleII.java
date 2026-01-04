package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0119bPascalTriangleII {
    public List<Integer> getRow(int rowIndex) { 
        List<Integer> thisRow = new ArrayList<>();
        for (int i = 0; i < rowIndex; i++) {
            for (int j = thisRow.size() -1 ; j > 0; j--) {
                thisRow.set(j, thisRow.get(j) + thisRow.get(j-1));
            }
            thisRow.add(1);
        }
        return thisRow;
    }
}
