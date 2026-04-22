
using System;

public class HelloWorld
{
    public static void Main(string[] args)
    {
        Console.WriteLine("Enter a number: ");
        int count=0;
        int num=Convert.ToInt32(Console.ReadLine());
        for(int i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                count=1;
                break;
            }
        }
        
        if(count==0)
        {
            Console.WriteLine("Prime no");
        }
        else
        {
            Console.WriteLine("Not a prime no");
        }        
    }
}
