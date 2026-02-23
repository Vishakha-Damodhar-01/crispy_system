import java.util.*;
public class reverse 
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number...:");
        int n=sc.nextInt();
        int rev=0;
        int p=n;
        int r;
        System.out.println("Original Number is: "+n);
      
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }

        System.out.println("Reverse number is: "+rev);

        if(rev==p)
        {
            System.out.println(p+" is a palindrome number");
        }
        else
        {
            System.out.println(p+" is not an palindrome number");
        }
    }
}

