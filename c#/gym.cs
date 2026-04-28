// TCS question
using System;

public class HelloWorld
{
    public static void Main(string[] args)
    {
        try
        {
           Console.WriteLine ("Enter a month: ");
        int month=Convert.ToInt32(Console.ReadLine());
        
        switch(month)
        {
            case 1:
            Console.WriteLine("3000");
            break;
            
            case 2:
            Console.WriteLine("6000");
            break;
            
            case 3:
            Console.WriteLine("9000");
            break;
           
            case 4:
            Console.WriteLine("12000");
            break;
            
            case 5:
            Console.WriteLine("15000");
            break;
            
            default:
            Console.WriteLine("Invalid input");
            break;
        
        } 
        }
        catch(Exception e)
        {
            Console.WriteLine("Please enter valid positive integer");
        }
    }
}
