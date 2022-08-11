import java.util.Scanner;
class fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("press number till series u wan");
        int num = in.nextInt();
        System.out.println(0);
        for(int i= 1; i<=num;i++){
            int last = first + second;
            first = second;
            second = last;
            System.out.println(first);
        }
    }
}