import java.util.Scanner;

public class print_sum_n_natural_numbers {

    public static int sum(int num){
        if(num == 0 || num == 1){
            return num;
        }
        int nm1 = sum(num-1);
        int sn = num + nm1;
        return sn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        System.out.println(sum(num));
    }
}
