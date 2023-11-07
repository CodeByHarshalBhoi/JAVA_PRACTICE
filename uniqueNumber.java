import java.util.Scanner;

public class uniqueNumber {
    public static void unique(int num) {
        int count = 0;
        int rem1;
        int rem2;
        int num1 = num;
        int num2 = num;
        while (num1 != 0) {
            rem1 = num1 % 10;
            while (num2 != 0) {
                rem2 = num2 % 10;
                if (rem1 == rem2) {
                    count++;
                }
                num2 = num2 / 10;
            }
            num1 = num1 / 10;
        }
        if (count == 1) {
            System.out.println("number is unique");
        } else {
            System.out.println("number is not unique");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        unique(num);
    }
}
