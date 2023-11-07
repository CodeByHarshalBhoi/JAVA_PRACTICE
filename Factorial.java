public class Factorial {

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int fact_Rec(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void fact_for(int num){
         int n=1;
        for (int i=1;i<=num;i++){
            n=n*i;
        }
        System.out.println("answer is"+n);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fact(n));
        System.out.println(fact_Rec(n));
        fact_for(n);
    }
}
