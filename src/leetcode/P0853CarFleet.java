package leetcode;

import java.util.Arrays;

public class P0853CarFleet {

    public static void main(String[] args) {
        int target = 12;
        int[] position = new int[]{10,8,0,5,3};
        int[] speed = new int[]{2,4,1,1,3};
        System.out.println(carFleet(target, position, speed));
    }

    public static int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int fleetCount = 1; //always count the first car as a fleet
        double[][] cars = new double[n][2]; // first param position, second time to reach target
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (double) (target - position[i]) / speed[i];
        }
        Arrays.sort(cars, (b,a) -> Double.compare(a[0], b[0])); //sort by first parameter(position)
        double slowest = cars[0][1]; //first car
        for (int car = 1; car < n; car++) { //iterate from second car on
            if (cars[car][1] > slowest) {
                fleetCount++;
                slowest = cars[car][1];
            }
        }
        return fleetCount;
    }
    
}
