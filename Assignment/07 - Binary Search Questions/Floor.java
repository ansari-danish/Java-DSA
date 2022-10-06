public class Floor {
    public static void main(String[] args) {
        int []arr = {2,3,5,9,14,16,18};
        int target = 1;
        int start = 0;
        int end = arr.length-1;
        System.out.println(binarySearch(arr,target,start,end));
    }
    static int binarySearch(int []arr, int target, int start , int end ){
        while(start<=end){
            int mid =start + (end -start)/ 2;
            if(target<arr[mid]){
                end = mid-1;
            }
            if(target>arr[mid]){
                start = mid+1;
            }
            if(arr[mid]==target){
                return mid;
            }
        }
        return end;
    }
}