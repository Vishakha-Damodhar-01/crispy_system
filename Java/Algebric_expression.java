import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        int add=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        int mod=a%b;
        System.out.println("Addition is: "+add);
        System.out.println("Subtraction is: "+sub);
        System.out.println("Multiplication is: "+mul);
        System.out.println("Division is: "+div);
        System.out.println("Modulus is: "+mod);
    }
}

Enter a: 
975
Enter b: 
665
Addition is: 1640
Subtraction is: 310
Multiplication is: 648375
Division is: 1
Modulus is: 310
