abstract class car
{
    public abstract void drive();
    public abstract void fly();
    public void playmusic()
    {
        System.out.println("play music");
    }
}

abstract class Wagonr extends car
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

class UpdatedWagonr extends Wagonr     //concrete class
{
    public void fly()
    {
        System.out.println("Flying....");
    }
}

public class four
{
    public static void main(String a[])
    {
        car obj = new UpdatedWagonr();
        obj.drive();
        obj.playmusic();
        obj.fly();
    }
}