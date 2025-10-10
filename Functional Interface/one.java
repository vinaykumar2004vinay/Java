@FunctionalInterface            //one method only accepted
interface A
{
    void show();
}

class B implements A 
{
    public void show()
    {
        System.out.println("In Show");
    }
}

public class one
{
    public static void main(String a[])
    {
        A obj = new B();
        obj.show();
    }
}