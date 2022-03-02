import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num;
        System.out.println("Input a number");
        num = in.nextInt();
        for (int i = 1;i<=10;i++){
            System.out.println(num +" * "+ i +" = "+num*i);
        }
    }
}
