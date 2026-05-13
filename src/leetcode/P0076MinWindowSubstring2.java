package leetcode;

import java.util.HashMap;

public class P0076MinWindowSubstring2 {

    public static void main(String[] args) {
        System.out.println(minWindow("a", "aa"));
    }

    public static String minWindow(String s, String t) {
        HashMap<Character, Integer> target = new HashMap<>();
        HashMap<Character, Integer> currentWindow = new HashMap<>();
        
        for (int i = 0; i < t.length(); i++) target.merge(t.charAt(i), 1, Integer::sum);

        String minWindow = s+s;
        int left = 0;
        int charactersContained = 0;
        for (int right = 0; right < s.length(); right++) {
            System.out.println("right"+right);
            char charRight = s.charAt(right);
            currentWindow.merge(charRight, 1, Integer::sum);
            if (currentWindow.getOrDefault(charRight, 0).equals(target.getOrDefault(charRight,0))) charactersContained++;
            System.out.println("charactersContained"+charactersContained);
            while (charactersContained == target.size() ) {
                System.out.println("left"+left);
                if (right-left+1 < minWindow.length()) minWindow = s.substring(left, right+1);
                if (currentWindow.getOrDefault(s.charAt(left), 0).equals(target.getOrDefault(s.charAt(left),0))) charactersContained--;
                System.out.println("charactersContained"+charactersContained);
                currentWindow.merge(s.charAt(left), -1, Integer::sum);
                left++;
            }  
            
        }
        if (minWindow.length()>s.length()) return "";
        return minWindow;
        
    }

    
}
