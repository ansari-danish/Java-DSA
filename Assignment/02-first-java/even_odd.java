
//take a user input number and print its even or odd


import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = in.nextInt();
        if(number%2==0){
            System.out.println(number + " = Even Number ");
        }
        if(number%2!=0)
            System.out.println(number + " = Odd Number");
    }
}
