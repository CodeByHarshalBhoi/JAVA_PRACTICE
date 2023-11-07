import java.util.*;

public class Array_Same_Element_Check {

    public static void main(String[] args) {
        Integer[] arr1 ={1,2,3,4,5};
        Integer[] arr2 ={1,2,3,4,5,2,3,4};
        Integer[] arr3 ={1,2,2,3,3,4,5,6,7,9,9,2};
        Integer[] arr4 ={1,2,4,5,3,7,9};
//        boolean t=check(arr1,arr2);
//        boolean t1 = check(arr3, arr4);
//        if (t1){
//            System.out.println("yes your value is same ");
//        }else{
//            System.out.println("no ");
//        }

        System.out.println(sameElements(arr1,arr2));
    }
    static boolean sameElements(Integer[] a1,Integer[] a2) {
        Set<Integer> array1 = new HashSet<>(Arrays.asList(a1));
        Set<Integer> array2 = new HashSet<>(Arrays.asList(a2));

        if (array1.size() != array2.size())
            return false;

        for(int i=0; i<array1.size(); i++){
            Integer obj = a1[i];
            if(!array2.contains(obj)){
                return false;
            }
        }
        return true;
    }
    public static boolean check(int[] arr1, int[] arr2){
        for (int i=0;i< arr1.length;i++){
            if (arr1[i]!=arr2[i] && arr2[i]!=arr1[i]){
                return false;
            }
        }
        return true;
    }
}
