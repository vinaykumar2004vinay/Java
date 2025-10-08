class A
{
    public void show()
    {
        System.out.println("in A Show");
    }
    public void config()
    {
        System.out.println("in A Config");
    }
}
class B extends A
{
    public void show1()
    {
        System.out.println("in B Show");
    }   
}
public class three
{
    public static void main(String a[])
    {
        B obj = new B();
        obj.show();
        obj.config();
    }
}