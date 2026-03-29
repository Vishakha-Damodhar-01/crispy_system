// Maximum Product Subset
// You are given an array of integers (can include negative, zero, positive).
// Task: Find the maximum product possible by multiplying any subset of elements.
// Example
// Input:
// [-1, 2, 3, 4]
// Output:
// 24


import java.util.*;
public class one
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter number of elements added in the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements in array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are: "+Arrays.toString(arr));
        
        
        int product=1;
        for(int i=0;i<n;i++)
        {
           
            if(arr[i]>0)
            {
                product=product*arr[i];

            }
            else if (arr[i]==0) {
                continue;
            }
        }
        System.out.println("Product is: "+product);

    }
}



