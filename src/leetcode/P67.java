package leetcode;

public class P67 {
    public String addBinary(String a, String b) {
        boolean plus1 = false;
        int len = 0;
        String first = "";
        String second = "";
        String res = "";
        if (a.length() >= b.length()) {
            len = a.length();
            first = a;
            for (int i = 0; i < ( a.length() - b.length()); i++) {
            second += "0";
            }
            second += b;
        }
        else {
            len = b.length();
            for (int i = 0; i < ( b.length() - a.length()); i++) {
            first += "0";
            }
            first += a;
            second = b;
            }

        String[] stack = new String[len];
        int top = -1;
        int i = len-1;

        while (i >= 0) {
            if (first.charAt(i) != second.charAt(i)) {
                top++;
                if (plus1) {stack[top] = "0"; plus1 = true;}
                else stack[top] = "1";
            }
            if (first.charAt(i) == '0' && second.charAt(i)=='0') {
                top++;
                if (plus1) {stack[top] = "1"; plus1 = false;}
                else stack[top] = "0";
            }
            if (first.charAt(i)=='1' && second.charAt(i)=='1') {
                top++;
                
                if (plus1) {stack[top] = "1"; plus1 = true;}
                else stack[top] = "0"; plus1 = true;

            }
            i--;
        }
        if (i == -1 && plus1) res += "1";

    while (top>=0) {
        res += stack[top];
        top--;
        }    
    return res;
    }
}
