public class Linear_search {
    public static void main(String[] args) {
    int []arr = {1,2,3,4,5,8,12,21,32,};
    int target = 32;
        System.out.println(search(arr,target));
    }
    static int search (int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int index = arr[i];
            if ( index==target )
                return i ;
        }
        return -1;
    }
    }