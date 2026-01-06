package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class P0853CarFleet {

    public static void main(String[] args) {
        int target = 12;
        int[] position = new int[]{10,8,0,5,3};
        int[] speed = new int[]{2,4,1,1,3};
        System.out.println(carFleet(target, position, speed));
    }

    public static int carFleet(int target, int[] position, int[] speed) {
        Deque<ArrayList<Double>> stack = new ArrayDeque<>();
        int fleetCount = 0;
        ArrayList<ArrayList<Double>> pair = new ArrayList<>() ;
        for (int i = 0; i < position.length; i++) {
            ArrayList<Double> tempL = new ArrayList<>();
            tempL.add(Double.valueOf(position[i]));
            tempL.add(Double.valueOf(speed[i]));
            pair.add(tempL);
        }
        pair.sort((a,b) -> Double.compare(a.get(0), b.get(0)));
        System.out.println(pair);
        for (var a : pair) stack.push(a);
        while (!stack.isEmpty()) {
            double timePassed = (target - stack.peek().get(0)) / stack.peek().get(1);
            int carsReachedTarget = 0;
            for (var list : stack) {
                list.set(0, list.get(0) + timePassed * list.get(1));
                if (list.get(0) >= target) carsReachedTarget++;
            }
            for (int i = 0; i < carsReachedTarget; i++) {
                stack.pop();
            }
            fleetCount++;
        }

        return fleetCount;
    }
    
}
