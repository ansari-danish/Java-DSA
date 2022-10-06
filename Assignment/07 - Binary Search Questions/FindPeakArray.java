public class FindPeakArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 10, 8, 7, 5, 3, 1};
        int target = 2;
        int Peak = Bitonic(arr);
        int FirstTry = OrderAgnostic(arr,target,0,Peak);
        if(FirstTry != -1){
            System.out.println(FirstTry);
        }
        else
            System.out.println(OrderAgnostic(arr,target,Peak,arr.length-1));
    }
    static int OrderAgnostic(int []arr,int target, int start,int end){
        boolean check = arr[start]<arr[end];
        while(start<=end){
            int mid =  start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(check){
                if(target < arr[mid])
                    end = mid-1;
                 else
                    start = mid+1;
            }
            else{
                if(target < arr[mid])
                    start = mid+1;
                else
                    end = mid-1;

            }
        }
        return -1;
    }
    static int Bitonic(int []arr){
        int start = 0;
        int end  = arr.length-1;
        while (start < end ){
            int mid= start + (end-start)/2;
            if(arr[mid]<arr[mid+1])
                start = mid+1;
            else
                end = mid;
        }
        return start;
    }
}
