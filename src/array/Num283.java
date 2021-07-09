package array;

import java.util.Arrays;

/**
 * 移动0到数组的末尾
 */
public class Num283 {
    public static void main(String[] args) {
        int[] tmp = {0, 1, 0, 3, 12};
        moveZeroes(tmp);
    }

    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
