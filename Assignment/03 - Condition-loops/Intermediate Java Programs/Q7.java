//Power In Java;;;;;

/*
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        double num = in.nextDouble();
        System.out.println("Enter a power");
        double power = in.nextDouble();
        double total = Math.pow(num,power);
        System.out.println(total);
        }
    }
*/
//Power In Java;;;;;
import java.util.*;
public class Q7{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter number ");
        int number = in.nextInt();
        System.out.print("Enter Power ");
        int p = in.nextInt();
        int power = 1;
        while(p!=0){
            power *= number;
            p--;
        }
        System.out.println(power);
    }
}