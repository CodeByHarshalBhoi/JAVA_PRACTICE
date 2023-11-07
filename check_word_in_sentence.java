import java.util.Scanner;

public class check_word_in_sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentense");
        String str = sc.nextLine();

        System.out.println("Enter word");
        String word = sc.nextLine();

        String [] words = str.split(" ");

        for(int i=0; i< words.length; i++){
            if(words[i]==word){
                System.out.println("the word is availble in sentence is " + words[i]);
            }else{
                System.out.println("word id not available in sentence");
            }
        }
    }
}
