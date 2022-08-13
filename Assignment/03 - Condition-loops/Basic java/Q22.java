//Find the product and sum of each digits and subtract the sum from product;;;
import java.util.*;
public class Q22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num= in.nextInt();
        int product =1;
        int sum = 0;
        while (num>0){
            int temp = num%10;
            product *= temp;
            sum += temp;
            num /= 10;
        }
        System.out.println(product-sum);
    }
}