package leetcode.hot100.a_putongshuzu;

public class firstMissingPositive {


    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            while (nums[i] >= 1 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                int j = nums[i] - 1;
                int tmp = nums[j];
                nums[j] = nums[i];
                nums[i] = tmp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) return i + 1;
        }
        return n + 1;
    }
}
