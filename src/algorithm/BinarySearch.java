package algorithm;

public class BinarySearch {

    /**
     * 二分查找算法
     */
    public static int binarySearch(int[] arr, int start, int end,int target) {

        int mid = (end - start) / 2 + start;
        if(target == arr[mid]){
            return mid;
        }

        if(start >= end){
            return -1;
        }else if(target > arr[mid]){
            return binarySearch(arr,mid + 1,end,target);
        }else if (target < arr[mid]){
            return binarySearch(arr,start,mid - 1,target);
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5,6,7,8,9,10,12,14,15,16,17};

        int index = binarySearch(arr,0,arr.length-1,7);

        System.out.println(index + "");
    }
}
