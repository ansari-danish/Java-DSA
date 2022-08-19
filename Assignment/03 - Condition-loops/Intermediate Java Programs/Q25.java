//Kunal is allowed to go out with his friends only on the even days of a given month.
// Write a program to count the number of days he can go out in the month of August.
import java.util.*;
public class Q25 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num = 0;
        for (int i = 1;i<=31;i++){
            if(i%2==0){
               num++;
            }
        }
        System.out.println(num+" Days can go out");
    }
}
