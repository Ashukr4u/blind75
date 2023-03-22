package com.kishore.anant.blind75.array;

import java.util.Arrays;
import java.lang.Math;

/*
https://leetcode.com/problems/first-missing-positive/
 */
public class FirstMissingPositive {

    public static void main(String[] args) {
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive();
        int result = firstMissingPositive.firstMissingPositive(new int[]{3,4,-1,1});
        System.out.println(result);
    }

    public int firstMissingPositive(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            if(number <=0 || number > nums.length){
                nums[i] = nums.length+1;
            }
        }

        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            int number = Math.abs(nums[i]);
            if(number > nums.length){
                continue;
            }
            number--;
            if(nums[number] > 0){
                nums[number] = -1*nums[number];
            }
        }

        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= 0){
                return i+1;
            }
        }

        return nums.length+1;
    }
}
