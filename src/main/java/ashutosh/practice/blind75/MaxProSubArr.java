package ashutosh.practice.blind75;

public class MaxProSubArr {

    public static void maxProSubArr(int[] arr){
        int prod1=arr[0];
        int prod2=arr[0];
        int result=arr[0];

        for(int i=1; i<arr.length;i++) {
            int temp = Math.max(arr[i], Math.max(prod1*arr[i],prod2*arr[i]));
            prod2 = Math.min(arr[i], Math.min(prod1*arr[i],prod2*arr[i]));
            prod1=temp;

            result=Math.max(result,prod1);
        }
         System.out.println("max product : " + result);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,-3,0,-4,-5};
        maxProSubArr(nums);
    }
}
