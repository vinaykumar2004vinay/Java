@FunctionalInterface            //one method only accepted
interface A
{
    void show(int i);
}

public class four
{
    public static void main(String a[])
    {
        A obj = i -> System.out.println("In Show " + i);               //Lambda Expression
        obj.show(5);
    }
}