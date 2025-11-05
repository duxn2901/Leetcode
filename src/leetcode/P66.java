package leetcode;

public class P66 {
    public int[] plusOne(int[] digits) {
        int i = digits.length-1;
        while (i >= 0) {
            if (digits[i] < 9) {
            digits[i] = digits[i] + 1;
            break; 
            } else {
            digits[i] = 0;
            if (i==0) {

                int[] new_digits = new int[digits.length+1];
                new_digits[0] = 1;
                for (int j = 0; j <= digits.length-1; j++) {
                    new_digits[j+1] = digits[j];
                    
                }
                return new_digits;
            }
            i--;
        }
        
        }
        return digits;
    }
}
