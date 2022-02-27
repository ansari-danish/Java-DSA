//Peak Index in a Mountain Array
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class mountain {
    public static void main(String[] args) {
        int []arr = {2,4,6,5,3,1};
        int result = index(arr);
        System.out.println(result);
    }
    static int index(int []arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end ){
            int mid = start + (end - start )/ 2;
            if(arr[mid]>arr [mid + 1]){
                end = mid;
            }else
                start = mid + 1;
        }
        return start ;
    }
}
