public class linearSearch {
    public static int search(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,8,74,6,3,4,5};
        int key = 74;
        int index = search(arr, key);
        if(index == -1){
            System.out.println("index is not found");
        }else{
            System.out.println("key is found at " + index);
        }
    }
}
