package com.kishore.anant.blind75.array;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        TwoSum twoSum = new TwoSum();
        System.out.println(twoSum.twoSum(nums, target).toString());

    }

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> compMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(compMap.containsKey(nums[i])) {
                return new int[]{compMap.get(nums[i]), i};
            }
            else{
                compMap.put(target - nums[i], i);
            }
        }
        return new int[]{-1,-1};
    }
}
