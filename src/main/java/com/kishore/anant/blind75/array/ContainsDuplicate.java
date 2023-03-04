package com.kishore.anant.blind75.array;

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        boolean result = containsDuplicate.containsDuplicate(nums);
        System.out.println(result);
    }

    public boolean containsDuplicate(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num))
                return true;
        }
        return false;
    }
}