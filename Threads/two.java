class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("HI");
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("HELLO");
        }
    }
}

public class two
{
    public static void main(String a[])
    {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}