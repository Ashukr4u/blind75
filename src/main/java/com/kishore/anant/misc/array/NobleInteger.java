package com.kishore.anant.misc.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NobleInteger {

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 4, 4};
        NobleInteger nobleInteger = new NobleInteger();
        int result = nobleInteger.solve((ArrayList<Integer>) Arrays.stream(nums).boxed().collect(Collectors.toList()));
    }

    public int solve(ArrayList<Integer> nums) {

        nums.sort((a,b)-> Integer.compare(a,b));
        System.out.println(nums.toString());
        int count=0;
        for (int i = 0; i < nums.size()-1; i++) {
            if(nums.get(i) != nums.get(i+1) && nums.get(i) == nums.size()-i-1){
                count++;
            }
        }

        return nums.get(0);
    }
}
