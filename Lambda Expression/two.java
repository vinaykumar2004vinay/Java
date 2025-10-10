@FunctionalInterface            //one method only accepted
interface A
{
    void show(int i);
}

public class two
{
    public static void main(String a[])
    {
        A obj = new A()
        {
            public void show(int i)
            {
                System.out.println("In Show " + i);
            }
        };
        obj.show(5);
    }
}