import java.util.Scanner;

// Question link https://leetcode.com/problems/sqrtx/submissions/856212466/
public class Sqrt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an number");
    int x = in.nextInt();
        System.out.println("the sqrt is "+ search(x));
    }
    static int search(int x){
        int start = 1;
        int end = x;
        int res = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid <= x / mid){
                start = mid + 1;
                res = mid;
            }
            else
                end = mid - 1;
        }
        return res;
    }
}
