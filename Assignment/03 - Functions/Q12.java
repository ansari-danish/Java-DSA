// Write a program to check given is pythoogras triplet or not
package danish;
import java.util.*;
public class Q12{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = in.nextInt();
        System.out.print("Enter Number 3: ");
        int num3 = in.nextInt();
        boolean ans = pyth(num1,num2,num3);
        if ( ans )
            System.out.println("Pythogoras Triplet");
        else
            System.out.println("Not Triplet");
    }
    static boolean pyth(int num1,int num2,int num3){
        if ( num1<num2 && num2<num3 ){
            if ( num1*num1+num2*num2==num3*num3 ){
                return true;
            }
        }
            return false;
    }
}
