public class eleven
{
    public static void main(String a[])
    {
        int i = 2;
        int j = 0;
        int nums[] = new int[5];
        String str = null;
        try
        {
            j = 18/i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot Divide By Zero");                   
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay In Your Limit..");
        }
        catch(Exception e)
        {
            System.out.println("Something Went Wrong" + e);
        }
        System.out.println(j);
        System.out.println("Byeee....");
    }
}