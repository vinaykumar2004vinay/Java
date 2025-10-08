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
public class two
{
    public static void main(String a[])
    {
        A obj = new B();
        obj.show();
    }
}