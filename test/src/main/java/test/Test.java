package test;

class TestingForGit{
    private String Name;
    public TestingForGit(String name)
    {
        this.Name = name;
    }
    public String getGreet()
    {
        return this.Name;
    }
}
public class Test {
    public static void main(String[] args) {
        TestingForGit obj = new TestingForGit("Tamilarasan");
        System.out.println("Hey How are you "+obj.getGreet());
    }
}
