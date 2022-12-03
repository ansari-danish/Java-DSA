public class RotatedArray {
    public static void main(String[] args) {
        int []arr = {3,4,5,6,7,8,9,0,1,2};
        int target = 2;
    }
    public int search (int []arr, int target){
        int pivot = Pivot(arr);
        if(pivot == -1){
            return BinarySearch(arr,target,0,arr.length -1 );
        }
        if(arr[pivot] == target)
            return pivot;
        if(target >= arr[0]) {
            return BinarySearch(arr, target, 0, pivot - 1);
        }
        return BinarySearch(arr,target,pivot + 1,arr.length - 1);
    }
    static int Pivot(int []arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
         int mid = start + (end - start)/2;
         if(mid<end && arr[mid] > arr[mid + 1])
             return mid;
         if(mid>start && arr[mid] < arr[mid -1])
             return mid;
         if(arr[mid] <= arr[start])
             end = mid - 1;
         else
             start = mid + 1;
      }
        return -1;
    }
    static int BinarySearch(int []arr , int target, int start ,int end ){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target<arr[mid])
                end = mid - 1;
            else if ( target > arr[mid] )
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
