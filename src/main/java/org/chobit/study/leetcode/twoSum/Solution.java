package org.chobit.study.leetcode.twoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        if (null == nums || 0 == nums.length) {
            return null;
        }
        Map<Integer, Integer> map = prepare(nums, target);
        for (int i = 0; i < nums.length; i++) {
            int ele = nums[i];
            Integer idx = map.get(ele);
            if (null != idx && idx != i) {
                return new int[]{i, idx};
            }
        }
        return null;
    }

    private Map<Integer, Integer> prepare(int[] arr, int target) {
        Map<Integer, Integer> result = new HashMap<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            int val = target - arr[i];
            result.put(val, i);
        }
        return result;
    }

}
