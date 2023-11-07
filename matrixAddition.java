import java.util.Scanner;

public class matrixAddition {
    //    public static void mt(int arr[][], int rows, int cols){
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j <cols; j++) {
//                System.out.print("Enter the element at row " + (i + 1) + ", column " + (j + 1) + ": ");
//                arr[i][j] = sc.nextInt();
//            }
//        }
//    }
//    public static void printArr(int arr[][], int rows, int cols){
//        for(int i=0; i<rows; i++){
//            for(int j=0; j<cols; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//    public static void sum(int arr1[][], int arr2[][], int rows, int cols){
//       int result[][]=new int[rows][cols];
//       for(int i=0; i<rows; i++){
//           for(int j=0; j<cols; j++){
//               result[i][j] = arr1[i][j] + arr2[i][j];
//           }
//       }
//       printArr(result, rows, cols);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter rows");
//        int rows= sc.nextInt();
//        System.out.println("Enter cols");
//        int cols=sc.nextInt();
//        int m1[][]=new int[rows][cols];
//        int m2[][]=new int[rows][cols];
//        mt(m1,rows,cols);
//        printArr(m1, rows, cols);
//        mt(m2, rows,cols);
//        printArr(m2, rows, cols);
//        System.out.println("Addition of matrix is");
//        sum(m1,m2,rows,cols);
//    }
    public static void addEle(int arr[][], int rows, int cols) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter rows " + (i + 1) + " column " + (j + 1));
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void printMat(int arr[][], int rows, int cols){
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void sum(int arr[][],int arr2[][], int rows, int cols){
       int result[][]=new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                result[i][j]=arr[i][j]+arr2[i][j];
            }
        }
        printMat(result,rows,cols);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int rows = sc.nextInt();
        System.out.println("Enter cols");
        int cols = sc.nextInt();
        int m1[][] = new int[rows][cols];

        int m2[][] = new int[rows][cols];

        addEle(m1,rows,cols);
        System.out.println("first matrix");
        printMat(m1, rows, cols);

        addEle(m2,rows,cols);
        System.out.println("second matrix");
        printMat(m2,rows, cols);

        System.out.println("Sum of matrix");
        sum(m1,m2,rows,cols);
    }
}
