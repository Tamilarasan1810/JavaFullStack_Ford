package Inheritance_Demo;

class Super {
    int breadth;

    public Super(int breadth) {
        this.breadth = breadth;
        System.out.println("Super() Constructer");
    }

}

class Sub extends Super {
    int width;

    public Sub(int width, int breadth) {
        super(breadth);
        this.width = width;
        System.out.println("Sub() Constructor");
    }
}

class AnotherSub extends Sub {
    int height;

    public AnotherSub(int width, int breadth, int height) {
        super(width, breadth);
        this.height = height;
        System.out.println("AnotherSub() Constructor");
    }

    public int findArea() {
        return width * breadth;
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        AnotherSub anotherSubObj = new AnotherSub(2, 2, 2);
        System.out.println("Area: " + anotherSubObj.findArea());
    }
}
