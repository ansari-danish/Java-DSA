
//take a user input name and greet him/her;;;


import java.util.Scanner;

public class greeeting  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = in.nextLine();
        System.out.println("Hello "+name);
    }
}
