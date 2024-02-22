package Lambda.SAMInterface;

@FunctionalInterface
interface Greatable{
    public void wish(String msg);

}

/*class Greet  implements Greatable{
    public void wish(String msg)
    {
        System.out.println(msg);
    }
}*/
public class LabmdaDemo {
    public static void main(String[] args) {
       /* Greatable greetable  = new Greet();
        greetable.wish("Welcome to programming");*/

        Greatable greetable = (msg)->{
            System.out.println(msg);
        };
        greetable.wish("Welcome to programming");
        greetable.wish("Good Morning");
        greetable.wish("Hey there! how are you");

    }
}
