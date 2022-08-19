//Sum of Digits of number ;;
import java.util.*;
public class Q24{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num= in.nextInt();
        int sum =0;
        while (num !=0){
            sum = sum+num%10;
            num/=10;
        }
        System.out.println(sum);
    }
}