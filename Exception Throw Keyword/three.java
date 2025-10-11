public class three
{
    public static void main(String a[])
    {
        int i = 0;
        int j = 0;
        try
        {
            j = 18/i;
        }
        catch(ArithmeticException e)
        {
            j = 18/1;                
        }
        catch(Exception e)
        {
            System.out.println("Something Went Wrong" + e);
        }
        System.out.println(j);
        System.out.println("Byeee....");
    }
}