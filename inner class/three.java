class A 
{
    public void show()
    {
        System.out.println("in show");
    }
    static class B
    {
        public void config()
        {
            System.out.println("in config");
        }
    }
}

public class three
{
    public static void main(String a[])
    {
        A obj = new A();
        obj.show();

        A.B obj1 = new A.B();
        obj1.config();
    }
}