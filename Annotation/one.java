class A
{
    public void show()
    {
        System.out.println("in A show");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("in B show");
    }
}

public class one
{
    public static void main(String a[])
    {
        B obj = new B();
        obj.show();
    }
}