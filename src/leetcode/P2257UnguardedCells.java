package leetcode;

import java.util.HashSet;

public class P2257UnguardedCells {
    public static void main(String[] args) {
        int m = 4;
        int n = 6;
        int[][] guards = {{0,0},{1,1},{2,3}};
        int[][] walls = {{0,1},{2,2},{1,4}};
        System.out.println(countUnguarded(m, n, guards, walls));
    }

    public static int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        HashSet<String> guarded = new HashSet<>();
        HashSet<String> guardSet = new HashSet<>();
        HashSet<String> wallSet = new HashSet<>();
        for (int[] wall : walls) wallSet.add(wall[0] + "," + wall[1]);
        for (int[] guard : guards) guardSet.add(guard[0] + "," + guard[1]);
        for (int[] guard : guards) {
            int rguard = guard[0];
            int cguard = guard[1];

            //down
            for (int row = rguard+1; row < m; row++) {
                if (wallSet.contains(row + "," + cguard) || guardSet.contains(row + "," + cguard) ) {
                    break;
                }
                guarded.add(row + "," + cguard);
            }

            //up
            for (int row = rguard-1; row >= 0; row--) {
                if (wallSet.contains(row + "," + cguard) || guardSet.contains(row + "," + cguard) ) {
                    break;
                }
                guarded.add(row + "," + cguard);
            }

            //right
            for (int col = cguard+1; col < n; col++) {
                if (wallSet.contains(rguard + "," + col) || guardSet.contains(rguard + "," + col) ) {
                    break;
                }
                guarded.add(rguard + "," + col);
            }

            //left
            for (int col = cguard-1; col >= 0; col--) {
                if (wallSet.contains(rguard + "," + col) || guardSet.contains(rguard + "," + col)) {
                    break;
                }
                guarded.add(rguard + "," + col);
            }
        
        }
        
    return m*n - guards.length - walls.length - guarded.size();
    }
}

