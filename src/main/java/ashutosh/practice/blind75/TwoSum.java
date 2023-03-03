package ashutosh.practice.blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

    public static int[] findPairOfSum(int[] arr, int key){
        int[] res = {-1,-1};

        Map<Integer,Integer> pair = new HashMap<>();

        for (int i=0; i<arr.length;i++) {
            if(pair.containsKey(arr[i])){
                res[0] = pair.get(arr[i]);
                res[1] = i;
                return res;
            }
            pair.put(key-arr[i], i);
        }
        return res;
    }

    public static void main (String[] arg){
        int [] nums = {2,7,11,15};
        int key = 13;
        int[] pairOfSum = findPairOfSum(nums, key);
        System.out.println(Arrays.toString(pairOfSum));
    }
}
