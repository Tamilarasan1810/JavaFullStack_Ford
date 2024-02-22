package Generics.GenericDemo;

class GenericClass<T>
{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

//    public GenericClass(T t) {
//        this.t = t;
//    }

    public void addValue(T t)
    {
        this.t = t;
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        GenericClass obj = new GenericClass();
        obj.addValue(100);
        System.out.println("Value is: "+obj.getT());

        obj.addValue("Hello world");
        System.out.println("Value is: "+obj.getT());
    }
}
