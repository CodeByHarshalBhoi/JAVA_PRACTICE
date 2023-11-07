import java.util.Scanner;

public class number_digit_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int sum=0;
        while (num != 0){
            int newNum = num % 10;
            sum = sum + newNum;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
