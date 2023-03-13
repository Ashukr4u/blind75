package com.kishore.anant.algos.sorting.quick;

public class KthLargestElementInArray {

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        KthLargestElementInArray kthLargestElementInArray = new KthLargestElementInArray();
        int result = kthLargestElementInArray.findKthLargest(nums, 0, nums.length-1, nums.length-k);
        System.out.println(result);
    }

    public int findKthLargest(int[] nums, int low, int high, int k){
        while(low < high)
        {
            int pIndex = partition(nums, low, high);
            if(pIndex < k){
                low = pIndex+1;
            }
            else if(pIndex > k){
                high = pIndex-1;
            }
            else{
                break;
            }
        }
        return nums[k];
    }

    public int partition(int[] nums, int low, int high){
        int i = low -1;
        int pivot = nums[high];
        for(int j = low; j<high; j++) {
            if (nums[j] < pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        i++;
        swap(nums, i , high);
        return i;
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
