package danish;
public class max{
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,9};
        System.out.println(maxVal(arr));
    }
    static int maxVal(int []arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i]>max ){
                max = arr[i];
            }
        }
        return max;


    }
}