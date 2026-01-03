package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0119PascalTriangleII {
    public List<Integer> getRow(int rowIndex) { 
        List<Integer> lastRow = new ArrayList<>();
        lastRow.add(1);
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> thisRow = new ArrayList<>();
            if (i == 0) {
                thisRow.add(1);
                lastRow = thisRow;              
                continue;
            }
            thisRow.add(1);
            for (int j = 0; j <= lastRow.size()-2; j++) {
                thisRow.add(lastRow.get(j) + lastRow.get(j+1));            
            }
            thisRow.add(1);
            lastRow = thisRow;    
        }
        return lastRow;
    }
}
