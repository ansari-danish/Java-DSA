public class max2d {
    public static void main(String[] args) {
        int [][]arr= {
                {2,5,8,12},
                {15,18,188,22},
                {25,28,29,30}
                        };
        System.out.println(min(arr));
        System.out.println(max(arr));
    }
    static int min (int[][]arr){
        int min = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if ( arr[row][col]<min )
                    min = arr[row][col];
            }
        }
        return min;

    }
    static int max (int[][]arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if ( arr[row][col]>max )
                    max = arr[row][col];
            }
        }
        return max;
    }
}


