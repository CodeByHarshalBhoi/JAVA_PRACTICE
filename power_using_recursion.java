import java.util.Scanner;

public class power_using_recursion {
    public static long pow(int base, int power){
        if(power == 0){
            return 1;
        }
        return base * pow(base, power-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base");
        int base = sc.nextInt();
        System.out.println("Enter power");
        int power = sc.nextInt();
        System.out.println(pow(base, power));
    }
}
