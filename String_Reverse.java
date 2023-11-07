import java.sql.SQLOutput;

public class String_Reverse {

    public static void StringRevUs( String Name){

        String words[] = Name.split(" ");

        StringBuilder revString = new StringBuilder();

        for(int i=0; i< words.length; i++){
            String word = words[i];
        StringBuilder revWord = new StringBuilder(word);
        revWord.reverse();
        revString.append(revWord).append(" ");
        }
        System.out.println(revString);
    }
    public static void main(String[] args) {
        String Name = "Harshal";
        String str = "i am harshal";
        StringBuilder nw = new StringBuilder(Name);
        nw.reverse();
        System.out.println(nw);
        StringRevUs(str);

    }
}
