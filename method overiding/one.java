class A
{
    public void show()
    {
        System.out.println("in show");
    }
}
class B extends A
{
    
}
public class one
{
    public static void main(String a[])
    {
        B obj = new B();
        obj.show();
    }
}