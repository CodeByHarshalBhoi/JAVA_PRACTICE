import java.util.Scanner;

public class perfectNumber2 {

    public static boolean perfect(int num) {
        int sumOfDivisior = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sumOfDivisior = sumOfDivisior + i;
            }
        }
            return sumOfDivisior == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range");
        int range = sc.nextInt();
        System.out.println("the range between 1 to " + range);
        for(int i=1; i<range; i++){
            if(perfect(i)){
                System.out.println(i + " ");
            }
        }

    }
}
