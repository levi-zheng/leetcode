package array;

import java.util.HashMap;

public class Num1 {
    public static void main(String[] args) {
        int[] tmp = new int[]{3, 2, 4};
        twoSum(tmp,6);
    }


    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])&&map.get(target-nums[i])!=i) {
                return new int[]{i,map.get(target-nums[i])};
            }
        }
        return null;
    }
}
