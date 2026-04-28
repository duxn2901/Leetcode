package leetcode;

public class P0390EliminationGameRE {
    public int lastRemaining(int n) {
        return helper(1, 1, n, true);
    }
    
    public int helper(int start, int distance, int size, boolean isLeftToRight){
        if (size <= 1) return start;
        if (isLeftToRight) return helper(start+distance, distance*2, size/2, false);
        if (size%2==0) return helper(start, distance*2, size/2, true);
        return helper(start+distance, distance*2, size/2, true);
    }
}
