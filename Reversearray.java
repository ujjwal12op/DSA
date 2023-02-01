public class Reversearray {
    static void reverse(int arr[],int start ,int end){

            int temp;
            while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
            }

    }
    static void displayarray(int arr[],int n){
            for(int i=0;i<n;i++){
                System.out.println(arr[i]+" ");
                System.out.println();
            }
    }
    public static void main(String[] args) {
        //lets make  an array
        int arr[]={1,2,3,4,5,6};
        //displaying before reversing
        displayarray(arr, 6);
        reverse(arr, 0, 5);
        System.out.println("after reversing \n ");
        displayarray(arr, 6);



    }
}
