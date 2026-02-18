import java.util.Scanner;

public class hello
{
  public static void main(String[] args) 
  {
    System.out.println("Lets perform factorial of a number on particular user input number...");
    System.out.println("Enter a number:  ");
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    long factorial=1;
    
    for (int i=1;i<=n;i++)
    {
      factorial=i*factorial;

    }  
    System.err.println("Factorial of "+ n + " is: "+factorial);
  }
}
