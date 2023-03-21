package com.kishore.anant.misc.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AddOneToNumber {

    public static void main(String[] args) {
        AddOneToNumber addOneToNumber = new AddOneToNumber();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(6);
        arrayList.add(0);
        arrayList.add(6);
        arrayList.add(4);
        arrayList.add(8);
        arrayList.add(8);
        arrayList.add(1);
        arrayList = addOneToNumber.plusOne(arrayList);
        System.out.println(arrayList.toString());
    }

    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {

        int i =0;
        while(i< A.size() && A.get(i)==0){
            A.remove(i);
        }
        int len = A.size();
        int[] arr = new int[len+1];
        int carry = 1;

        for (i = len; i > 0; i--) {
            int oneAdded = A.get(i-1) + carry;
            arr[i] = oneAdded%10;
            carry = oneAdded >= 10 ? 1 : 0;
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        if (carry>0){
            resultList.add(carry);
        }

        for (i = 1; i < arr.length; i++) {
            resultList.add(arr[i]);
        }
        return resultList;
    }
}
