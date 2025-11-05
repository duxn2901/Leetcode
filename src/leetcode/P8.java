package leetcode;

public class P8 {
    public int myAtoi(String s) {
        boolean positive = true;
        int res = 0;
        int i = 0;
        if (0==s.length()) return 0;
       
            //1. bedingung
            while (i< s.length() &&s.charAt(i) == ' ') {
                i++;
            }
            //2.
            if (i< s.length() &&s.charAt(i) == '+') 
                i++;
            else if (i< s.length() &&s.charAt(i) == '-') {i++; positive = false;}

            //3.
            while (i< s.length() && Character.isDigit(s.charAt(i))) {
                if (res > ((Integer.MAX_VALUE - Character.getNumericValue(s.charAt(i)))/ 10)  && positive) return Integer.MAX_VALUE;
                if ((!positive && -1*res < (Integer.MIN_VALUE  + Character.getNumericValue(s.charAt(i)))/10 )) return Integer.MIN_VALUE;

                res = res * 10 + Character.getNumericValue(s.charAt(i));
                i++;   
             }
             return (positive) ? res : -1*res;

    }
}
