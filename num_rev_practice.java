import java.util.Scanner;

public class num_rev_practice {
    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }

    public static int sum(int num, int rev) {
        return num + rev;
    }

    public static boolean pelindrom(int sum) {
        int pel = sum;
        int rev = 0;
        while (sum != 0) {
            int rem = sum % 10;
            rev = rev * 10 + rem;
            sum = sum / 10;
        }
        return pel == rev;
    }

    public static int repeatPalinAndAdd(int number) {
        int sum = number;
        int reverse = reverse(number);

        while (!pelindrom(sum)) {
            System.out.println(sum + "+" + reverse + "=" + sum(sum, reverse));
            sum = sum(sum, reverse);
            reverse = reverse(sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println(reverse(num));
        System.out.println(sum(num, reverse(num)));
        System.out.println(repeatPalinAndAdd(num));

    }
}
