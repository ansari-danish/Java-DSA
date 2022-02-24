//Question find element in infinte sorted array
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class element {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40};
        int target = 19;
        int result = ans(arr, target);
        System.out.println(result);
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (arr[end] < target) {
            int newstart = end;
            end = end * 2;
            start = newstart;
        }
        return binary(arr, target, start, end);
    }

    static int binary(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target < arr[middle])
                end = middle - 1;
            if (target > arr[middle])
                start = middle + 1;
            if (target == arr[middle])
                return middle;
        }
        return -1;
    }
}
