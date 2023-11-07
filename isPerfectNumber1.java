import java.util.Scanner;
public class isPerfectNumber1 {
    public static boolean perfect(int num){
        int sumOfDivisor = 0;
        for(int i=1; i<num; i++){
            if(num%i == 0){
                sumOfDivisor = sumOfDivisor + i;
            }
        }
        return sumOfDivisor == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range to find perfect number");
        int rang = sc.nextInt();
        System.out.println("the range between 1 to " + rang);
        for(int i=1; i<=rang; i++){
            if(perfect(i)){
                System.out.println(i + " ");
            }
        }
    }
}
