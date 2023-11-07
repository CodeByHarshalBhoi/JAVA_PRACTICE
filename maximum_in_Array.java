public class maximum_in_Array {
    public static void main(String[] args) {
        int arr[]={1,5,2,1,58,33,49,35,12,45,96,85};
        int max=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

