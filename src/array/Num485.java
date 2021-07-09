package array;

/**
 * 最多0的个数
 */
public class Num485 {
    public static void main(String[] args) {
        int[] tmp = {1, 1, 0, 1, 1, 1};
        findMaxConsecutiveOnes(tmp);
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length==0){
            return 0;
        }
        int count = 0;
        int result = 0;
        for (int j : nums) {
            if (j != 1) {
                if (result < count) {
                    result = count;
                }
                count = 0;
            } else {
                count++;
            }
        }
        System.out.println( Math.max(count,result));
        return Math.max(count,result);
    }
}
