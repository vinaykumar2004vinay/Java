class Mobile
{
    String Brand;
    int Price;
    String Name;

    public void show()
    {
        System.out.println(Brand + " : " Price " : " + Name);
    }
    public class demo
    {
        public static void main(String a[])
        {
            Mobile obj1=new Mobile();
            obj1.Brand="Apple";
            obj1.Price=15000;
            obj1.Name="ios";

            Mobile obj2=new Mobile();
            obj2.Brand="Samsung";
            obj2.Price=7200;
            obj2.Name="Android";


            Mobile obj3=new Mobile();
            obj3.Brand="Vivo";
            obj3.Price=3000;
            obj3.Name="Smartphone";

            obj1.show();
            obj2.show();
            obj3.show();

        }
    }
}