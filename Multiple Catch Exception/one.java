public class one
{
    public static void main(String a[])
    {
        int i = 0;
        int j = 0;
        try
        {
            j = 18/i;
        }
        catch(Exception e)
        {
            System.out.println("Some Thing Went Wrong....." + e);                    //Arithmetic Exception
        }
        System.out.println(j);
        System.out.println("Byeee....");
    }
}