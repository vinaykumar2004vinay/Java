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

public class four
{
    public static void main(String[] args)
    {
        new A().show();
    }
}