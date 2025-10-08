class Laptop
{
    String model;
    int price;
    public String toString()
    {
        return "Hey";
    }
}

public class one
{
    public static void main(String a[])
    {
        Laptop obj = new Laptop();
        obj.model = "Hp Victus";
        obj.price = 65000;
        System.out.println(obj.toString());
    }
}