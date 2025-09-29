package leetcode.hot100.a_putongshuzu;

import java.util.Arrays;

public class lunzhuanshuzu {
    public static void main(String[] args) {
        lunzhuanshuzu lunzhuanshuzu = new lunzhuanshuzu();
        int[] ints = {1, 2, 3, 4, 5, 6, 7};
        lunzhuanshuzu.rotate(ints, 3);


    }

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] tmp = new int[len];
        for (int i = 0; i < len; i++) {
            tmp[(i + k) % len] = nums[i];
        }
        System.out.println(Arrays.toString(tmp));
        System.arraycopy(tmp, 0, nums, 0, len);
    }
}
