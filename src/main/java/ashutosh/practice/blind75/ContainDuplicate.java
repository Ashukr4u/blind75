package ashutosh.practice.blind75;

import java.util.Arrays;
import java.util.HashSet;

public class ContainDuplicate {

    public static boolean isDup(int[] arr) {
        Arrays.sort(arr);
        for (int i=1; i< arr.length;i++) {
            if(arr[i]==arr[i-1]) return true;
        }
        return false;
    }
    public static boolean isDup1(int[] arr) {
        HashSet<Integer> intSet = new HashSet<>();
        for (int i=0; i< arr.length;i++) {
            intSet.add(arr[i]);
        }
        return (intSet.size() != arr.length);
    }

    public static void main(String[] args) {
        int nums[]= {1, 2, 3, 1};

        System.out.println("isDup :" + isDup(nums));
        System.out.println("isDup 1: " + isDup1(nums));
    }
}
