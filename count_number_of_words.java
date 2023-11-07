import java.util.HashMap;
import java.util.HashSet;

public class count_number_of_words {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        String str = "This this is is done by Saket Saket";
        String word[] = str.split(" ");
        for (int i = 0; i < word.length; i++) {
            if (hm.containsKey(word[i])) {
                int count = hm.get(word[i]);
                hm.put(word[i], count + 1);
            } else {
                hm.put(word[i], 1);
            }
        }
        System.out.println(hm);
    }
}
