class Computer
{
    public void code()
    {

    }
}

class Laptop extends Computer
{
    public void code()
    {
        System.out.println("Code , Compile , run");
    }
}

class Desktop extends Computer
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

public class four
{
    public static void main(String a[])
    {
        Computer lap = new Laptop();

        Computer desk = new Desktop();

        Developer vinay = new Developer();
        vinay.devapp(desk);

    }
}