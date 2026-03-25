// normal code for the space separated value addition
import java.util.Scanner;
import java.util.Arrays; 

public class Space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of count want to add: ");
        int n = sc.nextInt(); 
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " space-separated integers:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }
        
        // Use Arrays.toString to see the actual numbers
        System.out.println("Your array: " + Arrays.toString(arr));
    }
}


// for the case for handling the exception
public class Space {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of count want to add: ");
        int n = sc.nextInt(); 
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " space-separated integers:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }
        
        // Use Arrays.toString to see the actual numbers
        System.out.println("Your array: " + Arrays.toString(arr));
        }
        catch(Exception e)
        {
            System.out.println("Please enter the valid integer data type elements");
        }
        
    }
}

