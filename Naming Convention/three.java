class A
{
    public A()
    {
        System.out.println("Object Created");
    }

    public void show()
    {
        System.out.println("In A Show");
    }
}

public class three
{
    public static void main(String[] args)
    {
        new A();
    }
}