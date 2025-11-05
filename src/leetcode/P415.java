package leetcode;

public class P415 {
    public String addStrings(String num1, String num2) {
        boolean carry = false;
        int digit1, digit2, sum;
        int i = 0;
        String answer = "";
        while (i <= Math.max(num1.length()-1, num2.length()-1)) {
            if (i > num1.length()-1) {
                digit1 = 0;
            }
            else digit1 = num1.charAt(num1.length()-1-i) - '0';

            if (i > num2.length()-1) {
                digit2 = 0;
            }
            else digit2 = num2.charAt(num2.length()-1-i) - '0';

            sum = digit1 + digit2;
            if (carry) {
                sum += 1;
                carry = false;
            }
            if (sum >= 10) {
                sum = sum % 10;
                carry = true;

            
            }
            i++;
            answer += Integer.toString(sum);
        }
        if (carry) answer += "1";
        return new StringBuilder(answer).reverse().toString();
    }
}
