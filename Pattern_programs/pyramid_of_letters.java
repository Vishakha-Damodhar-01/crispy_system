//Here we can make the multiple patterns of the name of the letters too
//1. 
public class pattern
{
    public static void main(String[] args)
    {
        int n=6;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("Vish"+"\t");
            }
            System.out.println();
        }
    }
}

//2..//same program with differnt logic
public class pattern
{
    public static void main(String[] args)
    {
        int n=6;
        for(int i=6;i>=1;i--)
        {
            for(int j=6;j>=i;j--)
            {
                System.out.print("Vish"+"\t");
            }
            System.out.println();
        }
    }
}

//output:
Vish	
Vish	Vish	
Vish	Vish	Vish	
Vish	Vish	Vish	Vish	
Vish	Vish	Vish	Vish	Vish	
Vish	Vish	Vish	Vish	Vish	Vish

