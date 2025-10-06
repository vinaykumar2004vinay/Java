class Mobile
{
    String Brand;
    int Price;
    String Name;

    public void show()
    {
        System.out.println(Brand + " : "+ Price + " : " + Name);
    }
}

public class demo
{
    public static void main(String a[])
    {
        Mobile obj1=new Mobile();
        obj1.Brand="Apple";
        obj1.Price=1500;
        obj1.Name="SmartPhone";

        Mobile obj2=new Mobile();
        obj2.Brand="Samsung";
        obj2.Price=1700;
        obj2.Name="SmartPhone";

        obj1.show();
        obj2.show();
    }
}
