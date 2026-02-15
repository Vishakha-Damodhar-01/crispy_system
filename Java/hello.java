import java.util.Scanner;

public class hello
{
  public static void main(String[] args)
  {
    System.out.println("Welcome in the  Java world");
    Scanner sc=new Scanner(System.in);
    
    System.out.println("What is Your name: ");
    String name=sc.nextLine();

    System.out.println("What's your age: ");
    int age=sc.nextInt();

    System.out.println("My name is "+name+ "  and my age is "+age);

  }
}
