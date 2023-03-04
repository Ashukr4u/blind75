package com.kishore.anant.blind75.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ProductArrayExceptSelf {

    public static void main(String[] args) {

        int[] nums = {-1,1,0,-3,3};//{1,2,3,4};

        ProductArrayExceptSelf productArrayExceptSelf = new ProductArrayExceptSelf();
        int[] result = productArrayExceptSelf.productExceptSelf(nums);
        System.out.println(Arrays.toString(result));

    }

    public int[] productExceptSelf(int[] nums) {

        int len = nums.length;
        int[] left = new int[len];
        int[] right = new int[len];
        int[] product = new int[len];

        int countOfZeroes = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0)
                countOfZeroes++;
        }

        int leftProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            leftProduct *= nums[i];
            left[i] = leftProduct;
        }

        int rightProduct = 1;
        for (int i = len-1; i > -1; i--) {
            rightProduct *= nums[i];
            right[i] = rightProduct;
        }

        if (countOfZeroes > 1){
            return product;
        } else if (countOfZeroes > 0) {
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == 0) {
                    if (i - 1 > -1 && i + 1 < len)
                        product[i] = left[i - 1] * right[i + 1];
                    else if (i - 1 < 0) {
                        product[i] = right[i+1];
                    }
                    else{
                        product[i] = left[i-1];
                    }
                }
            }
        }
        else {
            for (int i = 1; i < len-1; i++) {
                product[i] = left[i-1]*right[i+1];
            }
            product[0] = right[1];
            product[len-1] = left[len-2];
        }

        return product;

    }
}
