//Take a input from user and find its leap year or not;;;;;


import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = in.nextInt();
        if(year%400 == 0) {
            System.out.println(year+" :"+" its a leap year");
        }
            if (year%100 != 0 && year%4 == 0) {
                System.out.println(year+" :"+" its a leap year");
        }
        else
            System.out.println(year+" : "+"not a leap year");
    }
}
