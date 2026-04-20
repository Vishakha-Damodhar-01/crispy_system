
using System;

public class HelloWorld 
{ 
    public static void Main(string[] args) 
    { 
        Console.WriteLine("Enter a number:"); 
        
        int num = Convert.ToInt32(Console.ReadLine()); 

        if (num % 2 == 0) 
        { 
            Console.WriteLine("Even"); 
        } 
        else 
        { 
            Console.WriteLine("Odd"); 
        } 
    } 
}
