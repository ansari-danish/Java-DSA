public class min{
    public static void main(String[] args) {
        int []arr = {2,5,3,6,4,-1,8,9,6,99};
        System.out.println(min(arr));
    }
static int min (int []arr){
        int ans = arr[0];
    for (int i = 1; i <arr.length ; i++) {
        if(ans<arr[i]){
            ans = arr[i];
        }
    }
    return ans;
}
}
