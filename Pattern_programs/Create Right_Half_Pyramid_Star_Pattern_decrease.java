Create Right_Half_Pyramid_Star_Pattern_increase.java
  public class pattern
{
    public static void main(String[] args)
    {
        int n=6;
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//output:
******
*****
****
***
**
*
