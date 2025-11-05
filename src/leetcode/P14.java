package leetcode;

public class P14 {
    public String longestCommonPrefix(String[] strs) {
        char letter;
        String res = "";
        int i = 0;
        if (strs == null || strs.length == 0) return "";
        while (strs.length > 0 && strs[0].length()>i) {
            letter = strs[0].charAt(i);
            for (String s : strs) {
                if (i>=s.length() || s.charAt(i) != letter) {
                    return res;
                }

            }
            res += letter;
            i++;
        }
        return res;

    }
}
