//take a input from user and print largest number;;;
import java.util.*;

public class Q25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int max= 0;
        do {
            System.out.print("Enter number(Press 0 to exit) " );
            num = in.nextInt();
            if (num>=max){
                max = num;
            }

        }while(num!=0);
        System.out.println("The largest number is "+max);
    }
}
