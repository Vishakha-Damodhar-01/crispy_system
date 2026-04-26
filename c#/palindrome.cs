using System;

public class HelloWorld
{
    public static void Main(string[] args)
    {
        Console.WriteLine ("Enter a number: ");
        int n=Convert.ToInt32(Console.ReadLine());
        int x=n;
        int r,rev=0;
        
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        Console.WriteLine("Reverese "+rev);
        
        if(rev==x)
        {
            Console.WriteLine("Palindrome no");
        }
        else
        {
            Console.WriteLine("Non Palindrome no");
        }
    }
}
