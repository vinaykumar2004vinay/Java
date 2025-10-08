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
public class three
{
    public static void main(String a[])
    {
        A obj = new A();
        obj.show();
    }
}