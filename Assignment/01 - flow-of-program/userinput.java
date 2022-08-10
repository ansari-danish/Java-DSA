
//take user input till press any letter;;;;;

import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        int num1=0;int num2 = 0;
        int i =2;
        Scanner in = new Scanner(System.in);
        System.out.println("enter your number");
        while(in.hasNextInt()){
            System.out.println("Enter your "+i+" number");
            num1 = in.nextInt();
            num2 += num1;
            i++;
        }
        System.out.println("your number is "+num2);

    }

        }