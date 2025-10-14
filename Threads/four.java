class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("HI");
            try 
            {
                Thread.sleep(10);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("HELLO");
            try 
            {
                Thread.sleep(10);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

public class four
{
    public static void main(String a[])
    {
        A obj1 = new A();
        B obj2 = new B();

        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();
    }
}