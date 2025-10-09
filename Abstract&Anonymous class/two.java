abstract class A
{
    public abstract void show();
}

public class two
{
    public static void main(String a[])
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("In A Show");
            }
        };
        obj.show();
    }
}