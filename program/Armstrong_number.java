What is the armstrong number
  The sum of cube of all the digits present in number equals to the number itself , this is called as Armstrong number


  import java.util.Scanner;

public class ArmstrongNumberChecker {

    // Helper method to count total digits in the number
    private static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Core validation logic
    public static boolean isArmstrong(int number) {
        // Negative numbers are not Armstrong numbers
        if (number < 0) return false;

        int totalDigits = countDigits(number);
        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            // Accumulate the digit raised to the power of total digits
            sum += Math.pow(lastDigit, totalDigits);
            number /= 10;
        }

        // Return true if the calculated sum matches the original input
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.util.in == null ? System.in : System.in);
        System.out.print("Enter an integer to check: ");
        
        if (scanner.hasNextInt()) {
            int inputNumber = scanner.nextInt();
            
            if (isArmstrong(inputNumber)) {
                System.out.println(inputNumber + " is an Armstrong number.");
            } else {
                System.out.println(inputNumber + " is not an Armstrong number.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        
        scanner.close();
    }
}
