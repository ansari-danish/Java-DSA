public class RotatedCount {
    public static void main(String[] args) {
    int [] arr = {3,4,5,6,8};
    int ans = Pivot(arr);
    if(ans == -1)
        System.out.println("not rotated");
    else
        System.out.println(ans+1);
    }
    static int Pivot(int []arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end  - start) /2 ;
            if(mid < end && arr[mid] > arr[mid + 1])
            return mid;
            if(mid > start && arr[mid]<arr[mid - 1])
                return mid;
            if(arr[mid]<=arr[start])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
