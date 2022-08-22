//Write a program to check the person is eligible for Vote or Not;;;
package danish;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ur age");
        int num = in.nextInt();
        int ans = VoteCheck(num);
        if ( ans == -1 )
            System.out.println(num+" Not eligible");
        else
            System.out.println(ans +" Eligible");
    }
    static int VoteCheck(int num){
        if ( num >=18 ){
            return num;
        }
        else
            return -1;
    }
}
