package array;

/**
 * 移除元素 双指针
 */
public class Num27 {
    public static void main(String[] args) {
        int[] tmp = {3, 2, 2, 3};
        System.out.println(removeElement(tmp, 3));
    }

    /**
     * 可以用双指针
     * i为右指针，用来遍历这个数组，指向当前要去比较的元素
     * index为左指针，指向下一个要修改值的位置
     * 如果右指针指向的元素不等于val，那么就要将右指针的值赋值到左指针位置，然后左右指针同时右移
     * 如果右指针指向元素等于val，那么它是要不予理会的元素，右指针向右即可，左指针不动。
     */
    public static int removeElement(int[] nums, int val) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }

    /**
     * todo 优化
     * 两个指针初始时分别位于数组的首尾，向中间移动遍历该序列。
     * <p>
     * 如果左指针指向的元素等于val，此时将右指针right 指向的元素复制到左指针left 的位置，然后右指针right左移一位。
     * <p>
     * 如果赋值过来的元素恰好也等于val，可以继续把右指针right指向的元素的值赋值过来（左指针left 指向的等于val 的元素的位置继续被覆盖），
     * <p>
     * 直到左指针指向的元素的值不等于 val 为止。
     * <p>
     * 当左指针left 和右指针right 重合的时候，左右指针遍历完数组中所有的元素。
     * <p>
     * 这样的方法两个指针在最坏的情况下合起来只遍历了数组一次。与方法一不同的是，方法二避免了需要保留的元素的重复赋值操作。
     */
    public static int removeElement2(int[] nums, int val) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[right - 1];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }
}
