interface A
{
    void show();
}

public class one
{
    public static void main(String a[])
    {
        A obj = () -> System.out.println("In Show");                    //Lambda Expression
        obj.show();
    }
}