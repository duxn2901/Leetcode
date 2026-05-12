package leetcode;

public class P0875EatingBananas {
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = -1;
        for (int i : piles) {
            if (i > right) right = i;
        }

        while (left <= right) {
            int mid = (right + left)/2;
            int count = 0;
            for (int i : piles) {
                count += Math.ceilDiv(i, mid);
                if (count > h) break;
            }
            if (count <= h) right = mid-1;
            else left = mid+1;
        }
        return left;

    }
}
