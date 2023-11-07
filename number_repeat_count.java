import java.util.Scanner;

public class number_repeat_count {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();

        System.out.println("enter targer number");
        int target = sc.nextInt();

        int count = 0;
        while(num != 0 ){
           int newNum = num%10;
           if(newNum == target){
               count++;
           }
            num=num/10;
        }
        System.out.println(count);
    }
}
