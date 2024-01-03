import java.util.HashSet;

// Time : 0(n*logn) + O(n)

public class FindDuplicates {

    public static int[] duplicates(int[] arr)
    {
        // Brute approach: Hash set
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }


        // Take all the values of the set into the array
        int k=set.size();
        int result[]=new int[k];
        int index=0;

        for(int value : set){
            result[index++]=value;
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        int[] uniques=duplicates(arr);
        for(int i=0;i<uniques.length;i++)
        {
            System.out.println(uniques[i]);
        }
    }
}
