package leetcode;

public class P58 {
    public int lengthOfLastWord(String s) {
        int count = 0;
        boolean wordStart = false;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {count++; wordStart = true;
            }
            else if (wordStart) break;

        }
        return count;
    }
}
