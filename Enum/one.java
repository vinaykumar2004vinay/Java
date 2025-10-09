enum Status
{
    Running , Failed , Success , Pending;
}

public class one
{
    public static void main(String a[])
    {
        Status s = Status.Pending;
        System.out.println(s);
    }
}