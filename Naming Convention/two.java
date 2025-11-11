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

public class two
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.show();
    }
}