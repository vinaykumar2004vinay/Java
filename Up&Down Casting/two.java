class A
{
    public void show1()
    {
        System.out.println("in A show");
    }
}

class B extends A 
{
    public void show2()
    {
        System.out.println("in B show");
    }
}

public class two
{
    public static void main(String a[])
    {
        A obj = new A();
        obj.show1();
        
    }
}