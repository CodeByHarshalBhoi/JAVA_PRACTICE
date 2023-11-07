import java.util.Scanner;

public class stringReverse {

//    public static String reverse(String str) {
//        StringBuilder sb = new StringBuilder();
//        char word[] = str.toCharArray();
//        for (int i = word.length - 1; i >= 0; i--) {
//            sb.append(word[i]);
//        }
//        return sb.toString();
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter string");
//        String str = sc.nextLine();
//        System.out.println(reverse(str));
//    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        char word[] = str.toCharArray();
        for (int i = word.length - 1; i >= 0; i--) {
            sb.append(word[i]);
        }
        return sb.toString();
    }

    public static String wordRev(String str) {

        String word1[] = str.split(" ");

        StringBuilder reverseString = new StringBuilder();

        for (String words : word1) {
            StringBuilder reverseWords = new StringBuilder(words);
            reverseWords.reverse();
            reverseString.append(reverseWords).append(" ");
        }
        String finalReseult = reverseString.toString().trim();
        return finalReseult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println(reverse(str));
        System.out.println(wordRev(str));
    }
}
