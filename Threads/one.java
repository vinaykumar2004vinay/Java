class A
{
    public void show()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("HI");
        }
    }
}

class B
{
    public void show()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("HELLO");
        }
    }
}

public class one
{
    public static void main(String a[])
    {
        A obj1 = new A();
        B obj2 = new B();

        obj1.show();
        obj2.show();
    }
}