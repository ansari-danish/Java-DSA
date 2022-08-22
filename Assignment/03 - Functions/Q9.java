//Write a program to Print Factorial of Number;;
package danish;
import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();
        factore(num);
    }
    static void factore(int num){
        for (int i =2;i<num;i++){
            if ( num%i*i==0 )
                System.out.println(i);
        }
    }
}
