@FunctionalInterface            //one method only accepted
interface A
{
    void show();
}

public class two
{
    public static void main(String a[])
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("In Show");
            }
        };
        obj.show();
    }
}