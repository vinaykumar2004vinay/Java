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
public class four
{
    public static void main(String a[])
    {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();
    }
}