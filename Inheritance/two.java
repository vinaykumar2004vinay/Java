class Calc
{
    public int add(int n1 , int n2)
    {
        return n1+n2;
    }

    public int sub(int n1 , int n2)
    {
        return n1-n2;
    }
}

public class two
{
    public static void main(String a[])
    {
        Calc obj = new Calc();
        int r1=obj.add(10,33);
        int r2=obj.sub(25,22);

        System.out.println(r1 + " " + r2);
    }
}