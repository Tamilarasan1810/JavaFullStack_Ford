package Assignment_Day6.BasicGenericClass;

class Box<Object> {
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Box(Object object) {
        this.object = object;
    }

    public void displayObjectType() {
        System.out.println(this.object.getClass());
    }
    public boolean isEmpty()
    {
        if (this.object == null) {
            return false;
        }
        return true;
    }
}

public class BasicGenericClass {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>(32);
        System.out.println("Retrived: "+box1.getObject());
        Box<String> box2 = new Box<>("Tamil");
        System.out.println("Retrived: "+box2.getObject());
    }
}
