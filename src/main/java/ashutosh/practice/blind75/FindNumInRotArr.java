package ashutosh.practice.blind75;

public class FindNumInRotArr {

    public static int searchNumInRotArr(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        while(low<=high) {
            int mid = (low+high)>>1;
            if (arr[mid] == target)
                return mid;
            if (arr[low] <= arr[mid]) {
                if(arr[low] <= target && arr[mid] >= target)
                    high = mid-1;
                else
                    low = mid+1;
            } else {
                if (arr[mid] <= target && arr[high] >= target)
                    low = mid+1;
                else
                    high = mid-1;
            }
        }
        return -1;
    }
/*
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2,3};
        int target = 3;
        System.out.println("The index in which the number is present is " + searchNumInRotArr(arr, target));
    }
    */



    public static void main(String[] args) {

        int[] arrnum = {4,5,6,1,2,3};
        int target = 2;
        int low = 0;
        int high = arrnum.length-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (arrnum[mid] == target) {
                System.out.println("found at index : " + mid );
                System.exit(0);
            }
            if(arrnum[low] <= arrnum[mid]){
                if(arrnum[low] <= target && arrnum[mid]>= target){
                    high=mid-1;
                } else {
                    low= mid+1;
                }
            } else {
                if(arrnum[mid]<=target && arrnum[high]>=target){
                    low=mid+1;
                } else {
                    high=mid-1;
                }
            }
        }
        System.out.println("not found at index : " );
    }
}
