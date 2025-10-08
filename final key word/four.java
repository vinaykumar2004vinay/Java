class Calc
{
    public void show()
    {
        System.out.println("By Vinay");
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}

class AdvCalc extends Calc
{
    public void show()
    {
        System.out.println("By Kumar");
    }
}

public class four
{
    public static void main(String a[])
    {
        AdvCalc obj = new AdvCalc();
        obj.show();
        obj.add(4,5);
    }
}