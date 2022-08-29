package danish;

import java.util.Arrays;

public class reverseArr {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int []arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swapArr(arr, start, end);
            start++;
            end--;
        }

    }
        static void swapArr(int []arr,int a ,int b){
            int temp = arr[a];
            arr[a]=arr[b];
            arr[b]= temp;
        }
    }

