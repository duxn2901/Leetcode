package leetcode;

public class P0167TwoSumSortedArray {
    public int[] twoSum(int[] numbers, int target) {
        int left, right, targetInt;
        int[] answer = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            targetInt = target - numbers[i];
            left = i+1;
            right = numbers.length-1;
            while (left <= right) {
                int mid = (left + right) /2;
                if (numbers[mid] == targetInt) {
                    answer[0] = i+1;
                    answer[1] = mid+1;
                    return answer;
                }
                else if (numbers[mid] > targetInt) right = mid-1;
                else left = mid+1;
            }
        }
        return answer;
    }
}
