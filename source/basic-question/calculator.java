import java.util.Scanner;
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class calculator {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
    int a ;
        System.out.println("enter number");
        a = in.nextInt();
        char input;
        System.out.println("operator");
        input = in.next() .charAt(0);
        int b ;
        System.out.println("enter another number");
        b = in.nextInt();
        if(input == '+')
            System.out.println("a+b="+ a+b);
       else if(input == '-')
            System.out.println( a-b);
        else if(input == '*')
            System.out.println("a*b="+a*b);
        else if(input == '/')
            System.out.println("a/b="+a/b);
        else
            System.out.println("invalid opertor");
    }}
