
using System;

public class Speed {
    public static void Main(string[] args) {
       
        Console.WriteLine("Enter distance (meters):"); 
        float d = float.Parse(Console.ReadLine());

        Console.WriteLine("Enter time (seconds):");
        float t = float.Parse(Console.ReadLine());

        float div = 18.0f / 5.0f; 
        float speed = (d / t) * div;

        Console.WriteLine("Speed (km/h): " + speed);
    }
}
