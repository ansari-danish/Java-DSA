
//Input a String and check whether its Palindrome or not

import java.util.Scanner;
class Palindrome{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter a word to check");
        String str = in.next();
        String rev = "";
        for(int i = str.length()-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("this is palindrome");
        }
        else
            System.out.println("Not Palindrome");
    }
}