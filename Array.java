// Array is a collection of items of similar datatypes stored at contigous memory locatiion.
// Array size is fixed
// 0 (zero-based indexing): The first element of the array is indexed by a subscript of 0.
// 1 (one-based indexing): The first element of the array is indexed by the subscript of 1.

// how to initialise array :
// 1)int[]={}
// 2)int[5]={1,2,3,4}
// 3) int[]={1,2,3,4}
// universal initialise
// 4) int [] {1,2,3,4,5};

// operations performed on array
// 1) Searching 2) Insertion 3)Deletion

// Types of array:
// 1) 1-D array
// 2) Multidimensional array

// Advantages of using array:
// 1)Arrays allow random access to elements. This makes accessing elements by position faster.
// 2)Arrays have better cache locality which makes a pretty big difference in performance.
// 3)Arrays represent multiple data items of the same type using a single name.

// Disadvantages of using arrays: 
// You can’t change the size i.e. once you have declared the array you can’t change its size because of static memory allocation. Here Insertion(s) and deletion(s) are difficult as the elements are stored in consecutive memory locations and the shifting operation is costly too.

// Applications on Array
// Array stores data elements of the same data type.
// Arrays are used when the size of the data set is known.
// Used in solving matrix problems.
// Applied as a lookup table in computer.
// Databases records are also implemented by the array.
// Helps in implementing sorting algorithm.
// The different variables of the same type can be saved under one name.
// Arrays can be used for CPU scheduling.
// Used to Implement other data structures like Stacks, Queues, Heaps, Hash tables, etc.


// However, the above declaration is static or compile-time memory allocation, which means that the array element’s memory is allocated when a program is compiled. Here only a fixed size (i,e. the size that is mentioned in square brackets []) of memory will be allocated for storage, but don’t you think it will not be the same situation as we know the size of the array every time, there might be a case where we don’t know the size of the array. If we declare a larger size and store a lesser number of elements will result in a wastage of memory or either be a case where we declare a lesser size then we won’t get enough memory to store the rest of the elements. In such cases, static memory allocation is not preferred.


//Operations on array
1.
public class Array 
{  
public static void main(String args[])   
{  
int n1 = 225, n2 = 115, sum;  
sum = n1 + n2;  
System.out.println("The sum of numbers is: "+sum);  
}  
}  
