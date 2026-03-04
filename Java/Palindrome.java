import java.util.Scanner;

public class palindrome_string 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        // String same =str;
        StringBuilder reverse_string=new StringBuilder(str);

        reverse_string.reverse();

        String reverse_str=reverse_string.toString();
        System.out.println("Original String: "+str);
        System.out.println("Reversed string: "+reverse_str);

        if(str.equals(reverse_str))
        {
            System.out.println("The string is palindrome");

        }
        else
        {
            System.out.println("The string is not palindrome");
        }
    }
}
