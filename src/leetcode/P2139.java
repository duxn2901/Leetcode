package leetcode;
// 2139. Minimum Moves to Reach Target Score
public class P2139 {
    public int minMoves(int target, int maxDoubles) {
        int count = 0;
        int doubleCount = 0;
        int t = target;
        while (t!=1) { 
            while (t%2==0 && doubleCount<maxDoubles) {
                t /= 2;
                count++;
                doubleCount++;
            }
            if (doubleCount == maxDoubles) return count + t-1;
            if (t==1) break;
            t--;
            count++;
        }
        return count;
    }
}
