package Generics.GenericCalculator;
import java.util.*;
class Calculator<T , U > {
    private T t;
    private U u;

    public Object add(T t, U u) {
        this.t = t;
        this.u = u;
        if (t instanceof Integer && u instanceof Integer) {
            System.out.println("Int Sum is: " + (((Integer)this.t).intValue() + ((Integer)this.u).intValue()));
            return (((Integer)this.t).intValue() + ((Integer)this.u).intValue());
        }
        else if(t instanceof Double && u instanceof Double )
        {
            System.out.println("Double Sum is: " + (((Double)this.t).doubleValue() + ((Double)this.u).doubleValue()));
            return (((Double)this.t).doubleValue() + ((Double)this.u).doubleValue());
        }
        else if(t instanceof String  && u instanceof String )
        {
            System.out.println("Double Sum is: " + t+u);
            return  ((String)this.t+this.u);
        }
        return null;
    }
}

public class GenericCalculator {
    public static void main(String[] args) {
        Calculator<Integer, Integer> calculator1 = new Calculator<>();
        calculator1.add(100, 200);

        Calculator<Double, Double> calculator2 = new Calculator<>();
        calculator2.add(100.10, 200.10);

        Calculator<String, String> calculator3 = new Calculator<>();
        calculator3.add("Tamil","arasan");
    }
}
