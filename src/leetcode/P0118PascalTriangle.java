package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0118PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> lastRow = new ArrayList<>();      
        lastRow.add(1);

        for (int i = 0; i < numRows; i++) {
            List<Integer> thisRow = new ArrayList<>();

            thisRow.add(1);
            if (i == 0) {
                answer.add(thisRow);
            } else {
                for (int j = 0; j <= lastRow.size()-2; j++) {
                    thisRow.add(lastRow.get(j) + lastRow.get(j+1));
                }
                thisRow.add(1);
                answer.add(thisRow);
                lastRow = thisRow;
            }
        }
        return answer;
    }
}
