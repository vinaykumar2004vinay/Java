enum Status
{
    Running , Failed , Success , Pending;
}

public class three
{
    public static void main(String a[])
    {
        Status[] ss = Status.values();
        System.out.println(ss[0]);
    }
}