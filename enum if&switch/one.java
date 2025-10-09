enum Status
{
    Running , Failed , Success , Pending;
}

public class one
{
    public static void main(String a[])
    {
        Status s = Status.Pending;

        if(s == Status.Running)
            System.out.println("ALL GOOD");

        else if(s == Status.Failed)
            System.out.println("TRY AGAIN");

        else if(s == Status.Pending)
            System.out.println("PLEASE WAIT");

        else
            System.out.println("DONE");
    }
}