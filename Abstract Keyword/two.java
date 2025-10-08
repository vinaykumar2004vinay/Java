abstract class car
{
    public abstract void drive();
    public void playmusic()
    {
        System.out.println("play music");
    }
}

class Wagonr extends car
{
    public void drive()
    {
        System.out.println("Driving....");
    }
}

public class two
{
    public static void main(String a[])
    {
        car obj = new Wagonr();
        obj.drive();
        obj.playmusic();
    }
}