enum Status
{
    Running , Failed , Success , Pending;
}

public class five
{
    public static void main(String a[])
    {
        Status[] ss = Status.values();

        for(Status s : ss)
        {
            System.out.println(s + " : " + s.ordinal());
        }
    }
}