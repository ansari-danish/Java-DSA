
// Find the number that is equal to or less then number;;;

public class Floor {
    public static void main(String[] args) {
        int []arr = {2,5,8,9,11,15,19,22,25,29};
        int target = 35;
        System.out.println(solution(arr,target));
    }
    static int solution(int []arr,int target){

        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if( target < arr[mid]){
                end=mid-1;
            }
            if( target > arr[mid]){
                start = mid+1;
            }
            if( target == arr[mid]){
                return mid;
            }
        }
        return end;
    }
}
