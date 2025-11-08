package leetcode;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
// Encode and Decode Strings
// Design an algorithm to encode a list of strings to a single string. The encoded string is then decoded back to the original list of strings.
// Please implement encode and decode



public class P271 {
    public static void main(String[] args) {
        ArrayList<String> strs = new ArrayList<>(Arrays.asList("neet","code","love","you"));
        System.out.println(encode(strs));
        System.out.println(decode(encode(strs)));
    }

    public static String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String str : strs) {
            encoded.append(str.length() + ":" + str);
        }

        return encoded.toString();
    }
    public static List<String> decode(String str) {
        ArrayList<String> decoded = new ArrayList<>();
        int index = 0;
        int len = 0;
        while (index < str.length()) {
            if (str.charAt(index) == ':') {
                decoded.add(str.substring(index + 1, index+len+1));
                index = index + len + 1;
                len = 0;
            }
            else {
            len = len*10 + Character.getNumericValue(str.charAt(index));
            index++;
            }
        }
        return decoded;
    }
}
