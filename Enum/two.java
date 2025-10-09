enum Status
{
    Running , Failed , Success , Pending;
}

public class two
{
    public static void main(String a[])
    {
        Status s = Status.Pending;
        System.out.println(s.ordinal());
    }
}