// To search for an element in an array of size perform a linear search by iterating through the array. If  is found, output "YES"; otherwise, 
// output "NO". The solution requires reading and  then looping through the array elements, comparing each with 


// Input: 5 3
// 7 3 5 2 1
// Output: YES

// Input: 5 10
// 7 3 5 2 1
// output:NO
  

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read N (size) and X (target element)
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] a = new int[n];
        boolean found = false;

        // Read array elements and check for X
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] == x) {
                found = true;
            }
        }

        // Output result
        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}
