// # Q1: Gym Membership Problem Statement
// # The gym offers membership plans for specific durations. The cost of each plan is as follows:
// # 1-month membership → ₹2000
// # 3-month membership → ₹5000
// # 6-month membership → ₹9000
// # 9-month membership → ₹12000
// # 12-month membership → ₹15000
// # Write a program that:
// # Takes the membership duration (in months) as input.
// # Displays the corresponding membership cost.
// # If the user enters a duration other than the specified plans, the program should display an error message:"Invalid Input"


import java.util.*;

public class tcs
{
    public static void main(String[] args)
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a month: ");
            int month=sc.nextInt();

            switch(month)
            {
                case 1:
                    System.out.println("3000");
                    break;
                case 3:
                    System.out.println("6000");
                    break;
                case 6:
                    System.out.println("9000");
                    break;
                case 9:
                    System.out.println("12000");
                    break;
                case 12:
                    System.out.println("15000");
                    break;
                default:
                    System.out.println("Invalid input, for this months no plan is there in gym");
            }
        }
        catch(Exception e)
        {
            System.out.println("Please enter an positive integer value");
        }

    }
}
