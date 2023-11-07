
import java.util.*;
import java.io.*;


public class ab {

    public static void main (String[] args) {
        // Arguments will be read by STDIN
        Scanner s = new Scanner(System.in); // do not change this
        int inputLine = s.nextInt(); // do not change this

        for (int i = 1; i <= inputLine; i++) {
            // Print spaces before the asterisks
            for (int j = 1; j <= inputLine - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.print(inputLine);
    }
}

