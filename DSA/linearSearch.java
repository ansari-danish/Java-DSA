//find a index of a given number in a array using Linear Search
// the time complexity of linear Search is O(N)


import java.util.Arrays;
import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Choose a number "+ Arrays.toString(arr));
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        int result = ls(arr,target);
        if (result == -1)
            System.out.println("Element is not present is array");
        else
            System.out.println("Element is on "+result +" position");
    }
    static int ls (int []arr,int target){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target) {
                return i;
            }

        }return -1;
    }
}
