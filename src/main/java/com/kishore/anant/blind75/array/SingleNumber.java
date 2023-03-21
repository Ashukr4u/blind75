package com.kishore.anant.blind75.array;

/*
https://leetcode.com/problems/single-number/description/
 */
public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int result = singleNumber.singleNumber(new int[]{4,1,2,1,2});
        System.out.println(result);
    }

    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int i:nums){
            xor ^= i;
        }
        return xor;
    }
}
