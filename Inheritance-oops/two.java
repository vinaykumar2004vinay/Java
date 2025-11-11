class Calculator
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }

    public int sub(int n1,int n2)
    {
        return n1-n2;
    }
}

class AdvCalc extends Calculator
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

public class two
{
    public static void main(String[] args)
    {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(2,3);
        int r2 = obj.sub(5,4);
        int r3 = obj.multi(2,5);
        int r4 = obj.div(10,5);

        System.out.println("r1 = " + r1 + " : " + "r2 = " + r2 + " : " + "r3 = " + r3 + " : " + "r4 = " + r4 );
    }
}