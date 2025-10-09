interface Computer
{
    void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("Code , Compile , run");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("Code , Compile , run : Faster");
    }
}

class Developer
{
    public void devapp(Computer lap)
    {
        lap.code();
    }
}

public class seven 
{
    public static void main(String a[])
    {
        Computer lap = new Laptop();

        Computer desk = new Desktop();

        Developer vinay = new Developer();
        vinay.devapp(lap);

    }
}