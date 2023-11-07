import java.util.Scanner;

public class primeNumber {
    public static void prime(int num){
        if(num == 0 || num == 1){
            System.out.println(num + " is not prime");
        }
        if(num % 2 == 0){
            System.out.println("number is prime");
        }else {
            System.out.println("number is not prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int num= sc.nextInt();
        prime(num);
    }
}
