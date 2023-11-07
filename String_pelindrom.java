import java.util.Scanner;

public class String_pelindrom {
    public static boolean pel(String str){
        int start = 0;
        int end  = str.length()-1;

        while(start<end){
            if(str.charAt(start)!= str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
//        System.out.println(pel(str));
        if(!pel(str)){
            System.out.println("String is not pelindrom");
        }else{
            System.out.println("String is pelindrom");
        }
    }
}
