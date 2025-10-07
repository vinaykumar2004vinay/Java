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

class Advcalc extends Calc
{
    public int multi(int n1,int n2)
    {
        return n1*n2;
    }
    public int div(int n1,int n2)
    {
        return n1/n2;
    }
}

public class four
{
    public static void main(String a[])
    {
        Advcalc obj = new Advcalc();
        int r1=obj.add(2,3);
        int r2=obj.sub(7,2);
        int r3=obj.multi(5,2);
        int r4=obj.div(10,2);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}