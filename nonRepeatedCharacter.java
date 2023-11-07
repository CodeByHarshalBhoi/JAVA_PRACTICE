
import java.util.*;
import java.io.*;


public class nonRepeatedCharacter {

    public static void FirstNonRepeat(String str)
    {

        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(str.charAt(i), str.indexOf(str.charAt(i)) + 1) == -1) {
                System.out.println("First non-repeating character is "+ str.charAt(i));
                break;
            }
        }
    }
    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter sentence");
        String inputLine = s.nextLine();
        FirstNonRepeat(inputLine);
    }
}

