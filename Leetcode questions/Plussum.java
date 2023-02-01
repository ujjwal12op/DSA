
import java.util.Arrays;
public class Plussum{
    public static void main(String[] args) {
         int[] digits={1,2,3};
         System.out.println(Arrays.toString(plusOne(digits)));
    }
    static int[] plusOne(int[] digits) {
        int len=digits.length;
        for(int i=len-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i]=0;
            }
        }
        //When only one element in the array [9];
        int[] newarray=new int[len+1];
        newarray[0]=1;
        return newarray;
    }
}