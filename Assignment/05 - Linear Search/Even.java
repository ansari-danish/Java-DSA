public class Even {
    public static void main(String[] args) {
        int []arr = {11,2582,1,654,25896};
        System.out.println(findNumber(arr));
    }
    static int findNumber(int[]arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                arr[i]=arr[i]*-1;
            }
            if ( countN(arr[i])%2==0 ){
                count++;
            }
        }
        return count;
    }
    static int countN(int i ){
        int count=(int)Math.log10(i)+1;
        return count;
    }
}
