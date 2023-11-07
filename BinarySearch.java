import java.util.Arrays;

public class BinarySearch {
    public static int bSearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return key;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {15, 85, 45, 3, 12, 4, 9, 35, 78, 1};
        int key = 78;
        Arrays.sort(arr);
        printArr(arr);
        System.out.println("key is found in array "+ bSearch(arr, key));
    }
}
