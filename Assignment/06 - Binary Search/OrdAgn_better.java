public class OrdAgn_better {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int target = 9;
        int start = 0;
        int end = arr.length - 1;
        System.out.println(binary(arr,target,start,end));
    }
        static int binary(int [] arr,int target,int start,int end){
            boolean asc = arr[start] < arr[end];
            while(start<=end){
                int mid = start +(end-start)/2;
                if(arr[mid]==target) {
                  return mid;
                }
                if(asc){
                    if(target<arr[mid]){
                        end = mid-1;
                    }
                    else
                        start= mid+1;
                }
                else
                if(target>arr[mid]){
                    end = mid-1;
                }
                else
                    start= mid+1;
            }
        return -1;
    }}
