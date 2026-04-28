package leetcode;

import java.util.ArrayList;

public class P1823FindWinnerCircular {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i<=n; i++) list.add(i);
        return helper(list, k, 0);
    }

    public int helper(ArrayList<Integer> list, int k, int position) {
        if (list.size() == 1) return list.get(0);
        int removePos = (position+k-1)%list.size();
        list.remove(removePos);
        if (removePos == list.size()) removePos = 0;
        return helper(list, k, removePos);
    }
}
