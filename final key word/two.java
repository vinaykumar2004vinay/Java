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
public class two
{
    public static void main(String a[])
    {
        Calc obj = new Calc();
        obj.show();
        obj.add(4,5);
    }
}