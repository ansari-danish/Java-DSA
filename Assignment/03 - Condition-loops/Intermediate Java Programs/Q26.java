//Write a program to print the sum of negative numbers, sum of positive even numbers and the
// sum of positive odd numbers
// from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
import java.util.*;
public class Q26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int odd = 0;
        int even = 0;
        int negative = 0;
        while (true) {
            System.out.println("Enter a Number");
            num = in.nextInt();
            if (num < 0) {
                negative += num;
            }
             else{
                 if (num % 2 == 0) {
                    even += num;}
                else{
                    odd += num;}
            }
        if (num == 0) {
            System.out.println("Negative Number " + negative + " Even Number " + even + " Odd Number "
                    + odd );
            break;
        }
    }
    }
    }