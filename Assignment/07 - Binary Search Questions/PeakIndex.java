public class PeakIndex {
    public static void main(String[] args) {
    int []arr = {2,4,6,8,5,3,1};
    System.out.println(BinarySearch(arr));
    }

    static int BinarySearch(int []arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            int mid = start + (end - start) /2;
            if(arr[mid] >= arr[mid+1])
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }
}
