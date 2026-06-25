// WE will perform the algebric expressions using c#
using System;

public class HelloWorld 
{ 
    public static void Main(string[] args) 
    { 
        Console.WriteLine("Enter a:");
        int a = Convert.ToInt32(Console.ReadLine()); 
        Console.WriteLine("Enter b:");
        int b = Convert.ToInt32(Console.ReadLine()); 
        int add=a+b;
        Console.WriteLine("Addition: ", add);
        int sub=a-b;
        Console.WriteLine("Subtraction: ", sub);
        int mul=a*b;
        Console.WriteLine("Multiplication: ", mul);
    } 
}

//output:
Enter a:
10
Enter b:
5
Addition: 
