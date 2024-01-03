public class Day1 {

    // static class Calc {
    //     public int add(int arr[]) {
    //         int value = 0;
    //         for (int x : arr) {
    //             value += x;
    //         }
    //         return value;
    //     }
    // }

    public static void main(String[] args) {
        // Anonymous array use:
        // Calc obj = new Calc();
        // int nums[] = {5,1,2,3};
        // int final1 = obj.add(nums);

        // System.out.println("sum1 is "+ final1);
        // // Now you can use obj to call the add method.


        // Array index out of bound Exception

        int arr[] = {1,2,3,4};

        // System.out.println(arr[4]);
        

        // To handle it:
        for(int i : arr){
            System.out.println(i);
        }


        // Strings in Java

        

    }
}
