package com.kishore.anant.algos.sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] nums = {3,1,2,4,1,7,5,2,6,4};
        MergeSort mergeSort = new MergeSort();
        int[] result = mergeSort.mergeSort(nums);
        System.out.println(Arrays.toString(result));
    }

    public int[] mergeSort(int[] nums){
        return mergeSort(nums, 0, nums.length-1);
    }

    public int[] mergeSort(int[] nums, int low, int high){

        if(low < high) {
            int mid = low + (high-low) / 2;
            mergeSort(nums, low, mid);
            mergeSort(nums, mid + 1, high);
            merge(nums, low, mid, high);
        }
        return nums;
    }

    private void merge(int[] nums, int low, int mid, int high) {

        int n1 = mid-low+1;
        int n2 = high-mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = nums[i+low];
        }

        for (int i = 0; i < n2; i++) {
            R[i] = nums[i+mid+1];
        }

        int i=0,j=0;
        int k = low;
        while (i < n1 && j < n2){
            if (L[i] <= R[j]){
                nums[k] = L[i];
                i++;
            }
            else{
                nums[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1){
            nums[k] = L[i];
            i++;
            k++;
        }

        while (j<n2){
            nums[k] = R[j];
            k++;
            j++;
        }



    }

}
