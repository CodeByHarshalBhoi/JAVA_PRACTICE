public class fibonacci {
    public static void fib(int num) {
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 1; i <= num; i++) {
            System.out.print(a + ", ");
            a = b;
            b = c;
            c = a + b;
        }
    }

    public static int fib1(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        int fn = fib1(num - 1) + fib1(num - 2);
        return fn;
    }

    public static void main(String[] args) {
        fib(10);

        System.out.println(fib1(10));
    }
}
