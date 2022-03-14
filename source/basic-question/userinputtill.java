import java.util.Scanner;
public class userinputtill {
    public static void main(String[] args) {
int input = 0;
int sum = 0;
Scanner in = new Scanner(System.in);
        System.out.println("enter a nubmer");
while((input = in.nextInt())!=0){
    System.out.println("enter number");
    if(input != 0){
        sum = sum + input ;

    }
}
        System.out.println("your number "+ sum);
    }
}