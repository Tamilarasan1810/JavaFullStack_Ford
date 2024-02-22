package Lambda.DoOperations;
@FunctionalInterface
interface Operable{
    public void doOperation(int a,int b);
}


public class LambdaDemo {
    public static void main(String[] args) {

        // Implementing the functional interface method using lambda experssion.
        Operable addOperation = (a,b)->{
            System.out.println("Sum is: "+(a+b));
        };

        Operable sumOperation = (a,b)->{
            System.out.println("Sub is: "+(a-b));
        };

        Operable mulOperation = (a,b)->{
            System.out.println("Mul is: "+(a*b));
        };

        addOperation.doOperation(2,4);
        sumOperation.doOperation(2,4);
        mulOperation.doOperation(2,4);

    }
}
