package leetcode;

import java.util.ArrayList;

public class P38 {
    public String countAndSay(int n) {
    	ArrayList<int[]> list;
    	String num = "1";
    	for (int i = 1; i <= n-1; i++) {
    		list = getPairIntFreq(num);
    		num = arrayListToString(list);
    	}
    	return num;
    }

    public static ArrayList<int[]> getPairIntFreq(String n) {
        ArrayList<int[]> result = new ArrayList<>();  
        int freq = 1;       
        String num = n;
        char digit = num.charAt(0);
        for (int i = 1; i < num.length(); i++) {
            if (num.charAt(i) != digit) {
                result.add(new int[]{ freq , Character.getNumericValue(digit)});
                digit = num.charAt(i);
                freq = 0;
            }
            freq++;
         
        }
        if (freq!=0) result.add(new int[]{ freq , Character.getNumericValue(digit)});
        return result;

    }
    
    public static String arrayListToString(ArrayList<int[]> list) {
    	String result = "";
    	for (int[] pair : list) {
    		result = result + pair[0] + pair[1];

    	}
    	return result;
    }
}
