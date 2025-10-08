abstract class car
{
    public abstract void drive();
    public abstract void fly();
    public void playmusic()
    {
        System.out.println("play music");
    }
}

class Wagonr extends car
{
    public void fly()
    {
        System.out.println("Flying....");
    }
    public void drive()
    {
        System.out.println("Driving....");
    }
}

public class three
{
    public static void main(String a[])
    {
        car obj = new Wagonr();
        obj.drive();
        obj.playmusic();
        obj.fly();
    }
}