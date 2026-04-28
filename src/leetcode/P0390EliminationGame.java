package leetcode;
import java.util.ArrayList;
//2 4 6 8 10 12 14 16 18 20
//2 6 10 14 18
//6 14
//6
public class P0390EliminationGame {
    public static void main(String[] args) {
        System.out.println(lastRemaining(100));
    }
    public static int lastRemaining(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <=n; i++) list.add(i);
        return helper(list, true);

    }

    public static int helper(ArrayList<Integer> list, boolean isLeftToRight){
        if (list.size() == 1) return list.get(0);
        if (isLeftToRight) {
            for (int i = 0; i < list.size(); i+=1) list.remove(i);
        }
        else for (int i = list.size()-1; i >= 0; i-=2) list.remove(i);
        System.out.println(list);
        return helper(list, !isLeftToRight);
    }
}
