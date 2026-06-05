package leetcode;
@SuppressWarnings("all")
public class P0374GuessNumber {
    public int guessNumber(int n) {
        int l = 1;
        int r = n;
        int mid;
        while (true) {
            if (l%2==1 && r%2==1) mid = l/2 + r/2 +1;
            else mid = l/2 + r/2;
            if (guess(mid) == -1) r = mid-1;
            else if (guess(mid) == 1) l = mid+1;
            else return mid;
        }
    }
}
