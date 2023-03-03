package ashutosh.practice.blind75;

public class MaxSubArrSum {

    public static void kadanesAlgo(int[] arr){
        int maxSoFar=0;
        int maxEndHere=0;

        for (int i=0, j=0; i<arr.length; i++){
            maxEndHere+=arr[i];
            if (maxEndHere<0){
                maxEndHere=0;
            }
            if(maxEndHere>maxSoFar) {
                maxSoFar=maxEndHere;
            }
        }
        System.out.println("max sum : " + maxSoFar);
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        kadanesAlgo(nums);
    }
}
