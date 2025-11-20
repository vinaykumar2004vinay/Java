class Parent
{
    public void M1()
    {
        System.out.println("Parent Class");
    }
}

class Child extends Parent
{
    public void M2()
    {
        System.out.println("Child Class");
    }
}

public class Test
{
    public static void main(String[] args)
    {
        Child obj = new Child();
        obj.M1();
        obj.M2();
    }
}