package ExceptionHandling.TryCatchFirst;

import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int x,y;
        while (true)
        {
//            try{

                System.out.print("Enter an number: ");
                x = sc.nextInt();
                System.out.print("Enter another number: ");
                y = sc.nextInt();
                sc.close();
                break;
//            }catch (Exception exe)
//            {
//                System.out.print("You have entered wrong input, please re-enter "+exe.getMessage());
//                    sc.next();
//            }

        }
    }
}
