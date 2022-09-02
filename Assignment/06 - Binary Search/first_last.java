import java.util.Arrays;

public class first_last{
    public static void main(String[] args) {
        int []arr = {2,7,7,7,8,9,5,1};
        int target = 7;
        int []ans=new int [2];
        ans[0]=binarySearch(arr,target,true);
        ans[1]=binarySearch(arr,target,false);
        System.out.println(Arrays.toString(ans));
    }
    static int binarySearch(int []arr,int target , boolean firstIndex){
        int ans =-1;
        int start =0;
        int end= arr.length-1;
        while (start<=end){
            int mid = start +(end-start)/2;
            if( target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else {
                ans = mid;
                if(firstIndex){
                    end = mid-1;
                }
                else
                    start= mid+1;
            }
        }
   return ans ;
    }
}