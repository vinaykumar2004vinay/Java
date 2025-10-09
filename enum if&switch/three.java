enum Status
{
    Running , Failed , Success , Pending;
}

public class three
{
    public static void main(String a[])
    {
        Status s = Status.Success;

        switch(s)
        {
            case Running:
                System.out.println("ALL GOOD");
                break;
            case Failed:
                System.out.println("TRY AGAIN");
                break;

            case Pending:
                System.out.println("PLEASE WAIT");
                break;

            default:
                System.out.println("DONE");
                break;

        }
    }
}