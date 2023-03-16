package com.kishore.anant.misc.array;

public class DeleteOneMaximumGCD {
    public static void main(String[] args) {
        int[] nums = {5, 15, 30};
        DeleteOneMaximumGCD maximumGCD = new DeleteOneMaximumGCD();
        int result = maximumGCD.maxGCD(nums);
        System.out.println(result);
    }

    private int maxGCD(int[] nums) {

        int len = nums.length;
        int[] prefixGCD = new int[nums.length];
        int[] suffixGCD = new int[nums.length];

        prefixGCD[0] = nums[0];
        suffixGCD[len-1] = nums[len-1];

        for (int i = 1; i < nums.length-1; i++) {
            prefixGCD[i] = gcd(prefixGCD[i-1], nums[i]);
        }

        for (int i = len-2; i >=0; i--) {
            suffixGCD[i] = gcd(suffixGCD[i+1], nums[i]);
        }

        int maxGCD = Math.max(suffixGCD[1], prefixGCD[nums.length-2]);
        for (int i = 1; i < nums.length-1; i++) {
            int currGCD = gcd(prefixGCD[i-1], suffixGCD[i+1]);
            if(maxGCD < currGCD){
                maxGCD = currGCD;
            }
        }
        return maxGCD;
    }

    public int gcd(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b, a%b);
        }
    }
}
