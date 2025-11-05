package leetcode;

import java.util.HashMap;

public class P2325 {
    public String decodeMessage(String key, String message) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        HashMap<Character, Character> subtable = new HashMap<>();
        int i = 0;
        String result = "";
        for (char c : key.toCharArray()) {
            if (c!=' ' && !subtable.containsKey(c)) {
                subtable.put(c, alphabet[i]);
                i++;
            }
            if (i>=alphabet.length) break;
        }
        for (char c : message.toCharArray()) {
            if (c == ' ') result += " "; else result += subtable.get(c);
           
        }
        return result;
    }
}
