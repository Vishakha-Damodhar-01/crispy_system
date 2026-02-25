public class reverse_string
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    System.out.println("Original String: "+str);

    StringBuilder reverse_string=new Stringbuilder(str);
    reverse_string.reverse();

    String rev_str=reverse_string.ToString();

    System.out.println("Rverse string: "+rev_str);
  }
}
  
    
