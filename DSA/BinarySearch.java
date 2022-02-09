// find a element index in a array using binary Search
//the time complexity of binarySearch is O(LogN)


import java.util.*;

public class BinarySearch{
    public static void main(String[] args) {
    int []arr = {10,12,13,18,24,30,50};
  //  Scanner input = new Scanner (System.in);
    int target  = 2;
    int start = 0;
    int end = arr.length - 1;
    int result = bs(arr,target,start,end);
    if (result == -1)
        System.out.println("Element does not exist");
    else
        System.out.println("Your element is on "+ result +" postion");
    }
    static int bs(int[]arr,int target ,int start,int end){
        while  (start <= end){
            int middle = start + (end - start) / 2;
            if (target < arr[middle])
          end = middle - 1;
if (target > arr[middle])
    start = middle + 1;


if (target == arr[middle] )
    return middle;
        }
        return -1;
    }
}