public class eight
{
    public static void main(String a[])
    {
        int i = 20;
        int j = 0;
        try
        {
            j = 18/i;
            if(j==0)
                throw new ArithmeticException("I Dont Want To Print Zero");
        }
        catch(ArithmeticException e)
        {
            j = 18/1;  
            System.out.println("Thats The Default Output" + e);              
        }
        catch(Exception e)
        {
            System.out.println("Something Went Wrong" + e);
        }
        System.out.println(j);
        System.out.println("Byeee....");
    }
}