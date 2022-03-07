public class infinite_array {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int target = 11;
        System.out.println(bs(arr,target));
    }
    static int bs (int []arr,int target){
        int start = 0;
        int end = 1;
        while(target >= arr[end]){
            start = end;
            end = end + end;
        }
        while (start <= end){
            int mid = start + (end - start )/2;
            if(arr[mid]>target)
                end = mid - 1;
            else if (arr[mid]<target)
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
