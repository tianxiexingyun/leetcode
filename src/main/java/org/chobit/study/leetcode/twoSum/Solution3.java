package org.chobit.study.leetcode.twoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {

    public int[] twoSum(int[] nums, int target) {
        if (null == nums || 0 == nums.length) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int ele = nums[i];
            if (map.containsKey(ele)) {
                return new int[]{i, map.get(ele)};
            }
            map.put(target - ele, i);
        }
        return null;
    }
}
