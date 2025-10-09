class A
{
    public void show()
    {
        System.out.println("In A Show");
    }
}

public class three
{
    public static void main(String a[])
    {
        A obj = new A()                                          //Anonymous class
        {
            public void show()
            {
                System.out.println("In new Show");
            }
        };
        obj.show();
    }
}