package leetcode;

public class P0394DecodeString {
    int i = 0;
    public String decodeString(String s) {
        String decoded = "";
        while (i < s.length()) {
            if (Character.isAlphabetic(s.charAt(i))) {
                decoded += s.charAt(i);
                i++;
            }
            else if (Character.isDigit(s.charAt(i))) {
                int k = 0;
                while (Character.isDigit(s.charAt(i))) {
                    k = k*10 + (s.charAt(i)-'0');
                    i++;
                }
                i++;    //skip '['
                String temp = decodeString(s);
                for (int j = 0; j<k; j++) decoded += temp;   
            }
            else if (s.charAt(i) == ']'){
                i++;
                return decoded;
            }
            
        }

        return decoded;
        
        
    }
}
