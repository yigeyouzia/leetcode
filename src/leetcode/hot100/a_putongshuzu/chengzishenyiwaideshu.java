package leetcode.hot100.a_putongshuzu;

import java.util.Arrays;

public class chengzishenyiwaideshu {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] res = new int[n];

            int[] l = new int[n];
            int[] r = new int[n];
            Arrays.fill(l, 1);
            Arrays.fill(r, 1);
            for (int i = 0; i < n - 1; i++) {
                l[i + 1] = l[i] * nums[i];
            }

            for (int i = n - 1; i >= 1; i--) {
                r[i - 1] = r[i] * nums[i];
            }

            for (int i = 0; i < n; i++) {
                res[i] = l[i] * r[i];
            }
            return res;
        }
    }


}
