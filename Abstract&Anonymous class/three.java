abstract class A
{
    public abstract void show();
    public abstract void config();
}

public class three
{
    public static void main(String a[])
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("In A Show");
            }

            public void config()
            {
                System.out.println("In Config");
            }

        };
        obj.show();
    }
}