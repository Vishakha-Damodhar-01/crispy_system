public class speed
{
    public static void main(String[] args) 
    {
         float distance,time,msec,kmhr;
         Scanner sc=new Scanner(System.in);
         distance=sc.nextFloat();
         time=sc.nextFloat();
         
         msec=distance/time;
         kmhr=msec*3.6;
         
         System.out.println("Speed in meter per second: "+msec);
         System.out.println("Speed in km per hour: "+kmhr);
    }
}
 
