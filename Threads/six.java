class A implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
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

class B implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
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

public class six
{
    public static void main(String a[])
    {
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}