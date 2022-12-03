public class MountArray {
    public static void main(String[] args) {
    int []arr = {2,4,6,8,10,9,7,5,3,1,0};
    int target = 0;
    int peak = Peak(arr,target);
    int firstTry = Binarysearch(arr,target,0,peak);
    if(firstTry != -1){
        System.out.println(firstTry);
    }else
        System.out.println(Binarysearch(arr,target,peak + 1,arr.length -1));

    }
    static int Peak(int[]arr, int target){
        int start = 0;
        int end = arr.length -1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid]>=arr[mid+1])
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }
    static int Binarysearch(int []arr,int target,int start,int end){
         boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target)
                return mid;
            if(isAsc){
                if(target < arr[mid])
                    end = mid - 1;
                else
                    start = mid+1;
            }
            else {
                if(target > arr[mid])
                    end = mid - 1;
               else
                   start = mid+1;
            }
        }
        return -1;
    }
}
