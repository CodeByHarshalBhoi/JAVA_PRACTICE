public class perfectNumbers {
    public static boolean isPerfectNumber(int number) {
        int sumOfDivisors = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0){
                sumOfDivisors = sumOfDivisors+i;
            }
        }
        return sumOfDivisors == number;
    }
    public static void main(String[] args) {
        int num = 100;

        System.out.println("Perfect numbers between 1 and " + num + ":");
        for (int i = 1; i <= num; i++) {
            if (isPerfectNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
}