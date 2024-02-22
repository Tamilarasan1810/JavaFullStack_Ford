import java.util.Date;
import java.util.*;
import java.util.*;

class MyGen<T> {
    T var;

    void set(T var) {
        this.var = var;
    }

    T get() {
        return var;
    }
}



public class helloWorld {
    interface GreetingService {
        void sayMessage(String message);
    }

    final static String salutation = "Hello! ";

    public static void main(String[] args) {
        GreetingService greetServicel = message -> System.out.println (salutation + message);
        greetServicel. sayMessage ("Mahesh");
    }


}