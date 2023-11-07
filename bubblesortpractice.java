public class bubblesortpractice {

    public static void printArr(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void bSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j< arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,21,59,34,514,9,5,25,3};
        System.out.println("main array");
        printArr(arr);
        System.out.println("after sorting");
        bSort(arr);
        printArr(arr);
    }
}
