import java.util.*;
public class Largest_Number_Array {

    public static int high(int arr[]) {
        int large = Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {
            if (large < arr[i]) {
                large = arr[i];
            }
        }
        return large;
    }

    public static int low(int arr[]) {
        int small = Integer.MAX_VALUE;


        for (int i = 0; i < arr.length; i++) {
            if (small > arr[i]) {
                small = arr[i];
            }
        }
        return small;

    }

    public static void main(String[] args) {

        int arr[] = {5, 9, 2, 9, 2, 95, 9, 2, 4};
        System.out.println(high(arr));
        System.out.println(low(arr));

        Date d =new Date();
        d.getDate();
        System.out.println(d);
        d.getTime();
        System.out.println(d);
        d.getDay();
        System.out.println(d);
    }

}
