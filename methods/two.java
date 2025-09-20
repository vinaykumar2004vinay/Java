class Calculator
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
}
public class demo
{
    public static void main(String a[])
    {
        Calculator obj=new Calculator();
        int r1=obj.add(n1:3,n2:4);
        System.out.println(r1);
    }
}