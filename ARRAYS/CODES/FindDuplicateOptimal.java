public class FindDuplicateOptimal {

    public static int[] removeDuplicates(int[] arr)
    {
        int i=0;
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                arr[i]=arr[j];
            }
        }
        int result[]=new int[i+1];
        
        for(int k=0;k<result.length;k++)
        {
            result[k]=arr[k];
        }
        return result;
        
    }
    public static void main(String[] args) {
        // 
        int arr[] = {1,1,2,2,2,3,3};
        int result[]= removeDuplicates(arr);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]);
        }
    }
}
