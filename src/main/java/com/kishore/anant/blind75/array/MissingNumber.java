package com.kishore.anant.blind75.array;
/*
https://leetcode.com/problems/missing-number/
 */
public class MissingNumber {

    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        int result = missingNumber.missingNumber(new int[]{3,0,1});
        System.out.println(result);
    }

    public int missingNumber(int[] nums) {
        boolean zeroFound = false;
        int xor = 0;
        for(int i:nums){
            if(i==0)
                zeroFound = true;
            else
                xor ^= i;
        }
        if (!zeroFound){
            return 0;
        }
        for (int i = 1; i <= nums.length; i++) {
            xor ^=i;
        }
        return xor;
    }
}
