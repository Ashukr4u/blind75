package com.kishore.anant.algos.sorting.quick;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        //int[] arr = {10, 80, 30, 90, 40, 50, 70};
        int[] arr = {5,2,3,1};
        QuickSort quickSort = new QuickSort();
        quickSort.sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public int[] sortArray(int[] nums) {
        return quickSort(nums, 0, nums.length-1);
    }

    private int[] quickSort(int[] nums, int low, int high) {
        if(low < high){
            int partitionIndex = partition(nums, low, high);
            quickSort(nums, low, partitionIndex-1);
            quickSort(nums, partitionIndex+1, high);
        }
        return nums;
    }

    private int partition(int[] nums, int low, int high) {

        int i = low-1;
        int pivot = nums[high];
        for (int j = low; j < high; j++) {
            if(nums[j] < pivot){
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i+1, high);
        return i;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
