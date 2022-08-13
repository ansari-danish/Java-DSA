//take input from user till user press 0;;;
import java.util.*;
public class Q24{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int sum = 0;
        do {
            System.out.print("Enter a number " );

            num = in.nextInt();
            sum+=num;
        }while(num!=0);
        System.out.print("Sum of all number is "+sum);
    }
}