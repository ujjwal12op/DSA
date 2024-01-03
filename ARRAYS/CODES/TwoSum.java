import java.util.HashMap;


//Time : O(n)
// Space: O(n) extra space used


public class TwoSum {

    public static int[] twoSum(int arr[],int target)
    {
       HashMap<Integer,Integer> map = new HashMap<>();

       int result[] = new int[2];

       for(int i=0;i<arr.length;i++)
       {
        int currentnumber=arr[i];
        int remainingValue=target-currentnumber;

        if(map.containsKey(remainingValue))
        {
            result[0] = map.get(remainingValue);
            result[1] = i;
            return result;
        }
        map.put(arr[i], i);
       }
       return result;

    }
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
      int[] res=twoSum(arr, 18);
      for(int i=0;i<res.length;i++)
      {
        System.out.print(res[i]+" ");
      }

    }
}
