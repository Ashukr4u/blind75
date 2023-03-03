package ashutosh.practice.blind75;

import java.util.Arrays;

public class ProArrExSelf {

    public static int[] productOfArrExSelf1(int[] arr) {
        int[] proArr = new int[arr.length];
        int prod = 1;
        for (int i=0; i<arr.length;i++) {
            prod*=arr[i];
        }
        for (int i=0; i<arr.length;i++) {
            proArr[i]=prod/arr[i];                  //possible Devide by zero runtime exception
        }
        return proArr;
    }

    public static int[] productOfArrExSelf(int[] nums) {
        int[] proArr = new int[nums.length];
        int prod = 1;
        for (int i=0; i<nums.length;i++) {
            proArr[i]=prod;
            prod*=nums[i];
        }
        prod=1;
        for (int i=nums.length-1; i>=0; i--) {
            proArr[i]=prod;
            prod*=nums[i];
        }
        return proArr;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] res = productOfArrExSelf(nums);
        System.out.println(Arrays.toString(res));
    }
}
