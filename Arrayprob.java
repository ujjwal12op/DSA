public class Arrayprob {
    static void largestnumber(int arr[],int size){
        //declare variables.
        int first,second,third,i;
        //check condition
        // we need atleast 3 elements so we need this condition;
        if(size<3){
            System.out.println("We need minimum of 3 elements ");
        }
        for(i=0;i<size;i++){
            //define first , second and third as minimum
            third=first=second=Integer.MIN_VALUE;
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
            }

            else if(arr[i]>second){
                second=first;
                first=arr[i];

            }
            else if(arr[i]>third){
                third=arr[i];
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
