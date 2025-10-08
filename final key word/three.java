class Calc
{
    public void show()
    {
        System.out.println("in Calc Show");
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}

class AdvCalc extends Calc
{

}

public class three
{
    public static void main(String a[])
    {
        AdvCalc obj = new AdvCalc();
        obj.show();
        obj.add(4,5);
    }
}