package ExceptionHandling.Throw;

import java.util.Scanner;

public class ThrowDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("Enter any number: ");
        x = sc.nextInt();
        System.out.println("Enter another number: ");
        y = sc.nextInt();

        try {
            if(y==0)
            {
                throw new ArithmeticException("y value must be non-zero");
            }
            int z = x / y;
            System.out.println("dive is: " + z);
        }catch (ArithmeticException exception)
        {
            System.out.println("exception is: "+exception.getMessage());
        }
        System.out.println("End of Program");
    }
}
