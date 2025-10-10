enum Laptop
{
    Macbook(80000) , Victus(65000) , Thinkpad(58000) , Asus(70000);
    private int price;
    private Laptop(int price)
    {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}

public class three
{
    public static void main(String a[])
    {
        for(Laptop lap : Laptop.values())
        {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}