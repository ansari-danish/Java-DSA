import java.util.Arrays;

public class FirstandLast {
    public static void main(String[] args) {
        int []arr={5,7,7,7,7,8,8,10};
        int target = 7;
        int []ans=new int [2];
        ans[0]=first(arr,target, true);
        ans[1]=first(arr,target,false);
        System.out.println(Arrays.toString(ans));
    }
    static int first(int []arr, int target , boolean firstOccur){
        int start = 0;
        int  end = arr.length-1;
        int ans =-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target < arr[mid])
                end = mid-1;
            else if ( target > arr[mid] )
                start = mid+1;

            else{
                ans = mid;
                if(firstOccur)
                    end = mid-1;

                else
                    start = mid+1;

            }
        }
        return ans;
    }
}