package com.kishore.anant.algos.sorting.merge;

import java.util.Arrays;

public class CountInversions {

    public static void main(String[] args) {
        int[] nums = {5,3,2,4,1};
        CountInversions countInversions = new CountInversions();
        int result = countInversions.countInversions(nums);
        System.out.println(result);
        System.out.println(Arrays.toString(nums));
    }

    public int countInversions(int[] nums){
        return mergeSort(nums, 0, nums.length-1);
    }

    private int mergeSort(int[] nums, int low, int high) {
        int inversionCount = 0;

        if(low < high){
            int mid = low + (high-low)/2;
            inversionCount += mergeSort(nums, low, mid);
            inversionCount += mergeSort(nums, mid+1, high);
            inversionCount += merge(nums, low, mid, high);
        }
        return inversionCount;
    }

    private int merge(int[] nums, int low, int mid, int high) {

        int inversions = 0;
        int n1 = mid-low+1;
        int n2 = high-mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = nums[low+i];
        }

        for (int i = 0; i < n2; i++) {
            R[i] = nums[mid+i+1];
        }

        int i=0, j=0;
        int k = low;
        while(i < n1 && j < n2){
            if (L[i] <= R[j]) {
                nums[k] = L[i];
                i++;
                k++;
            }
            else{
                nums[k] = R[j];
                j++;
                k++;
                inversions += (mid + 1) - (low + i);
            }
        }

        while (i < n1){
            nums[k] = L[i];
            i++;
            k++;
        }

        while(j < n2){
            nums[k] = R[j];
            j++;
            k++;
        }
        return inversions;
    }
}
