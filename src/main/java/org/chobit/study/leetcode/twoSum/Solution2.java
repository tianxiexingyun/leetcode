package org.chobit.study.leetcode.twoSum;

public class Solution2 {

    public int[] twoSum(int[] nums, int target) {
        int len = nums.length - 1;
        int i = 0;
        while (len > 0) {
            int sum = nums[len] + nums[i];
            if (sum == target) {
                return new int[]{i, len};
            } else if (i < (len - 1)) {
                i++;
            } else {
                len--;
                i = 0;
            }
        }
        return null;
    }

}
