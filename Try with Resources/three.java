class three
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
            System.out.println("Something Went Wrong");
        }
        finally
        {
            System.out.println("Byee");
        }
    }
}