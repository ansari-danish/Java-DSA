
//Find Average of a number;;;


import java.util.*;
public class Q3_i{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of element ");
        int n = in.nextInt();
        int sum =0;
        System.out.println("Enter a number respectively " );
        for (int i =1;i<=n;i++){
            System.out.print("Enter the "+i+"th value " );
            int num = in.nextInt();
            sum += num;
        }
        System.out.println("Sum of all number is "+sum);
        System.out.println("Average of number is "+sum/n);
    }
}
