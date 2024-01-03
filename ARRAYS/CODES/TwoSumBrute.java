public class TwoSumBrute {

    public static int[] twoSum(int arr[],int target)
    {
        int result[]=new int[2];

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]== target)
                {
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] ={2,6,5,8,11};
        int target=14;
        int res[] = twoSum(arr, target);
       for(int i=0;i<res.length;i++)
       {
         System.out.print("the array is"+res[i]);
       }
    }

}
