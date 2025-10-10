enum Laptop
{
    Macbook(80000) , Victus(65000) , Thinkpad , Asus(70000);
    private int price;

    private Laptop() {
        price = 45000;
    }
    private Laptop(int price)
    {
        this.price = price;
        System.out.println("in Laptop " + this.name());
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}

public class five
{
    public static void main(String a[])
    {
        for(Laptop lap : Laptop.values())
        {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}