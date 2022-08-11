
//built a basic calc using if statement;;;;

import java.util.Scanner;
public class basic_calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int num = in.nextInt();
        System.out.println("Press - + * /");
        char operator = in.next().charAt(0);
        System.out.println("another number");
        int num2 = in.nextInt();
        if(operator =='-'){
            System.out.println(num+"-"+num2+"is"+ (num - num2));
        }
        if(operator =='+'){
            System.out.println(num+"+"+num2+"is"+ num + num2);
        }
        if(operator =='*'){
            System.out.println(num+"*"+num2+"is"+num * num2);
        }
        if(operator =='/'){
            System.out.println(num+"/"+num2+"is"+num /num2);
        }
        else
            System.out.println("wrong operator");
    }
}
