
import java.util.*;
class Main {
    public static void main(String[] args) {
        int i=0;
        int j=1;
        System.out.println("The fibonnaci series will be: ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number till which you want the fibonacci series...");
        int n=sc.nextInt();
        System.out.println("The Fibonacci series will be: ");
        for(int v=0;v<=n;v++)
        {
            System.out.print(i+" ");
            int m=i+j;
            i=j;
            j=m;
        }
    }
}


//output:
The fibonnaci series will be: 
Enter a number till which you want the fibonacci series...
5
    
0 
1 
1 
2 
3 
5 
