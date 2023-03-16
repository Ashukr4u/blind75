package com.kishore.anant.misc.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NobleInteger {

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 3};
        NobleInteger nobleInteger = new NobleInteger();
        int result = nobleInteger.solve((ArrayList<Integer>) Arrays.stream(nums).boxed().collect(Collectors.toList()));
    }

    public int solve(ArrayList<Integer> nums) {

        for (int i:nums){

        }

        return nums.get(0);
    }
}
