class seven
{
    public static void main(String a[])
    {
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
        Runnable obj2 = () ->
        {
            System.out.println("HELLo");
            try 
            {
                Thread.sleep(10);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}