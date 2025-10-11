public class two
{
    public static void main(String a[])
    {
        int i = 20;
        int j = 0;
        try
        {
            j = 18/i;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot Divide By Zero");                   
        }
        catch(Exception e)
        {
            System.out.println("Something Went Wrong" + e);
        }
        System.out.println(j);
        System.out.println("Byeee....");
    }
}