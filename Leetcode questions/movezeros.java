import java.util.Arrays;
public class movezeros {
    public static void main(String[] args) {
       
        //For traversing the array.
        //two pointers to store the values.
        int nums[]={0,1,0,3,12};
        System.out.println(moveZeroes(nums));

    }
    static void moveZeroes(int[] nums) {
        int len1;
        //base condition
        len1=nums.length;
        //pointers
        int left=0;
        int right=0;
        while(right<len1){
            if(nums[left]!=0){
                left++;
                right++; //incrementing the pointers
            }
            else if(nums[right]==0){
                right++;
            }
            else{
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;

            }
        }
        
    }
}
