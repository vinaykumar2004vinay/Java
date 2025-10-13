import java.io.IOException;

class two
{
    public static void main(String a[]) throws IOException
    {
        System.out.println("Enter a Number");
        int num = System.in.read();
        System.out.println(num - 48);
    }
}