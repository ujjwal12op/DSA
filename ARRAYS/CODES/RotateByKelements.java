public class RotateByKelements {

    public static int[] rotateArray(int arr[],int k){
        k=k%arr.length;
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);

        return arr;

    }


    public static void reverse(int arr[],int start,int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] ={7,6,5,4,3,2,1};
        int resultarray[]=rotateArray(arr, 3);

        for(int i=0;i<resultarray.length;i++)
        {
            System.out.print(resultarray[i]);
        }
    }
}
