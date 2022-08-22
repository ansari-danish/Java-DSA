package danish;
//Define two methods to print the maximum and the minimum number respectively
// among three numbers entered by the user.

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Enter a number 1");
        num1 = in.nextInt();
        System.out.print("Enter a number 2");
        num2 = in.nextInt();
        System.out.print("Enter a number 3");
        num3 = in.nextInt();
        int max = max(num1, num2, num3);
        int min = min(num1, num2, num3);
        System.out.println("Maximum Value is: " + max);
        System.out.println("Minimum Value is: " + min);

    }

    static int min(int num1, int num2, int num3) {
        int max = num1;
        if ( max > num2 )
            max = num2;
        if ( max > num3 )
            max = num3;

        return max;
    }

    static int max(int num1, int num2, int num3) {
        int max = num1;
        if ( max < num2 )
            max = num2;
        if ( max < num3 )
            max = num3;
        return max;
    }
}

