package com.kishore.anant.algos.sorting.bucket;

import sun.awt.image.ImageWatched;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] nums = {1};
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        int[] result = topKFrequentElements.findTopKFrequentElements(nums, 1);
        System.out.println(Arrays.toString(result));
    }

    private int[] findTopKFrequentElements(int[] nums, int k) {
        List<Integer>[] bucketArray = new LinkedList[nums.length+1];

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for(int i: nums){
            if (frequencyMap.containsKey(i)){
                frequencyMap.put(i, frequencyMap.get(i)+1);
            }
            else{
                frequencyMap.put(i, 1);
            }
        }

        frequencyMap.forEach((a,b) -> {
            if(bucketArray[b] == null){
                LinkedList<Integer> linkedList = new LinkedList<>();
                linkedList.add(a);
                bucketArray[b] = linkedList;
        }
            else{
                bucketArray[b].add(a);
            }
        });
        int counter = 0;
        int result[] = new int[k];
        for (int i = nums.length; i >= 0 && counter < k; i--) {
            if (bucketArray[i] != null){
                for (int j = 0; j < bucketArray[i].size() && counter < k; j++) {
                    result[counter++] = bucketArray[i].get(j);
                }
            }
        }
        return result;
    }

}
