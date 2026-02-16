import java.util.Scanner;

public class hello
{
  public static void main(String[] args)
  {
    System.out.println("Arithmetic Operations using user Input");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter First value: ");
    int a=sc.nextInt();

    System.out.println("Enter second value: ");
    int b=sc.nextInt();

    System.out.println("Addition: "+(a+b));
    System.out.println("Subtraction: "+(a-b));
    System.out.println("Multiplication: "+(a*b));
    System.out.println("Division: "+(a/b));
    System.out.println("Modulus: "+(a%b));
  }
}
