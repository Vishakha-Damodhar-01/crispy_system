# Add elements elements
  
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
        


    }
}
