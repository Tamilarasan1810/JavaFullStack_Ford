package ExceptionHandling.TryCatchFinally;
import java.util.*;
public class ArithExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x value: ");
        int x = sc.nextInt();
        System.out.print("Enter y value: ");
        int y = sc.nextInt();
        try {
            int z=x/y;
            System.out.println("Division: "+z);
        }catch (ArithmeticException exception)
        {
            System.out.println("Exception is: "+exception.getMessage());
        }
        System.out.println("end of the program");

    }
}
