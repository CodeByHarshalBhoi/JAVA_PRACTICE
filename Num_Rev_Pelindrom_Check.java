public class Num_Rev_Pelindrom_Check {

    public static boolean palindrome(int num){
        int check=num;
        int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return check==rev;
    }
    public static int rev(int n){
        int rev=0;
        while(n!=0){
            int rem = n%10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int num = 1521;
        if(palindrome(num)){
            System.out.println("yes pelindrom");
        }else{
            System.out.println("No pelindrom");
        }
        System.out.println(rev(num));
    }
}
