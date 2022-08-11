
import java.util.Scanner;
public class largestinput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        System.out.println("enter a number");
        int num1 = in.nextInt();
        System.out.println("enter a another number");
        int num2 = in.nextInt();
        if(num1>num2)
            System.out.println(num1+"  is greater than "+num2);
             if (num1 == num2)
            System.out.println("both are same number");
             else
                 System.out.println(num2+"  is greater than "+num1);
    }
}
