import java.util.Scanner;

public class replace_word {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string here");
        String str = sc.nextLine();
        String newStr = str.replace("h", "s");
        System.out.println(newStr);
        System.out.println(str.indexOf("r"));
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.deleteCharAt(2));
        System.out.println(sb.insert(2, "W"));
    }
}
