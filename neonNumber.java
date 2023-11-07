import java.util.Scanner;

public class neonNumber {
    public static boolean neon(int num) {
        int rev=0;
        while (num != 0){
            int rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        int sqr = num * num;
        return sqr == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check neon");
        int num = sc.nextInt();
        if (neon(num)){
            System.out.println("number is neon");
        }else{
            System.out.println("number is not neon");
        }
    }
}
