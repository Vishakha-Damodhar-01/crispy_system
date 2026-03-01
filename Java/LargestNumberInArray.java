
public class LargestNumberInArray
{
    public static void main(String[] args)
    {
        int[] num={5,10,5,88,4,65};
        int largest=num[0];

        for (int i=0;i<num.length;i++)
        {
            if(num[i]>largest)
            {
                largest=num[i];
                
            }
        }

        System.out.println("Largest element in array: "+largest);
    }
}
