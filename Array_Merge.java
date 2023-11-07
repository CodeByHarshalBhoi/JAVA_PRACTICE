import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.*;

public class Array_Merge {
//    public static void main(String[] args) {
//        int arr1[] = {12, 2, 3, 1, 4, 2, 5, 8, 9, 6, 3, 1, 4, 5, 6};
//        int arr2[] = {2, 5, 2, 6, 1, 465, 66, 3, 6, 39, 7, 9, 36, 65, 665};
//        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
//        for (int i = 0; i < arr1.length; i++) {
//            hs.add(arr1[i]);
//        }
//        for (int i = 0; i < args.length; i++) {
//            hs.add(arr2[i]);
//        }
//        Integer [] mergedArray = new Integer[hs.size()];
//        for(int i=0; i<mergedArray.length; i++){
//            System.out.println(mergedArray[i] + " ");
//        }
//        System.out.println();
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int[] arr2 = new int[5];
        HashSet<Integer> h = new HashSet<>();
        System.out.println("enter element for first array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            h.add(arr[i]);
        }
        System.out.println("enter element for second array");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
            h.add(arr2[i]);
        }
        Integer[] arra = h.toArray(new Integer[h.size()]);
        System.out.println("your merged array is");
        for (int i=0;i< arra.length;i++){
            System.out.print(arra[i]+" ");
        }
        System.out.println();
    }
}
